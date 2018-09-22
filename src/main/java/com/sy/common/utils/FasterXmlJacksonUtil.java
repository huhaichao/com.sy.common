package com.sy.common.utils;
import java.io.IOException;
import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.sy.common.Exception.AppPayWechatServiceException;
import com.sy.common.bean.AppPayWechatBean.WechatPaySignable;

public class FasterXmlJacksonUtil {
	  private static ObjectMapper xmlMapper = new XmlMapper();
	  private static Logger logger = LoggerFactory.getLogger(FasterXmlJacksonUtil.class);

	  public static <T extends WechatPaySignable> T unmarshalFromXmlAndValidateSignature(String xml,
	      Class<T> expectedType, String key) throws AppPayWechatServiceException {
	    T object = unmarshalFromXml(xml, expectedType);
	    if (!UtilForWechatPay.validateSign((WechatPaySignable) object, key)) {
	      throw new AppPayWechatServiceException("Received PDU's signature is invalid.");
	    }
	    return object;
	  }

	  public static <T extends WechatPaySignable> T unmarshalFromXmlAndValidateSignature(
	      InputStream xmlStream, Class<T> expectedType, String key) throws AppPayWechatServiceException {
	    T object = unmarshalFromXml(xmlStream, expectedType);
	    if (!UtilForWechatPay.validateSign((WechatPaySignable) object, key)) {
	      throw new AppPayWechatServiceException("Received PDU's signature is invalid.");
	    }
	    return object;
	  }

	  public static <T extends Object> T unmarshalFromXml(String xml, Class<T> expectedType)
	      throws AppPayWechatServiceException {
	    try {
	      T object = xmlMapper.readValue(xml, expectedType);
	      logger.debug("Unmarshalled {} to {}", xml, expectedType);
	      return object;
	    } catch (IOException e) {
	      throw new IllegalArgumentException("Can not deserialize " + xml + " to type "
	          + expectedType.getName(), e);
	    }
	  }

	  public static <T extends Object> T unmarshalFromXml(InputStream xmlStream,
	      Class<T> expectedType) throws AppPayWechatServiceException {
	    try {
	      T object = xmlMapper.readValue(xmlStream, expectedType);
	      return object;
	    } catch (IOException e) {
	      throw new IllegalArgumentException("Can not deserialize stream to type "
	          + expectedType.getName(), e);
	    }
	  }

	  /**
	   * 封装成XML
	   * @param pdu
	   * @param key，如果非空，则尝试进行签名
	   * @return
	   */
	  public static String marshalToXml(Object pdu, String key) {
	    try {
	      if (!UtilForWechatPay.isEmpty(key)) {
	        if (pdu instanceof WechatPaySignable) {
	          WechatPaySignable signablePdu = (WechatPaySignable) pdu;
	          signablePdu.setSign(UtilForWechatPay.validateFieldsAndGenerateWxSignature(signablePdu, key));
	        }
	      }
	      return xmlMapper.writeValueAsString(pdu);
	    } catch (JsonProcessingException e) {
	      throw new IllegalArgumentException("Can not serialize " + pdu, e);
	    }
	  }

}
