package com.sy.common.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;

public class MD5 {

	public static String getMd5Str(String source) {

		byte b[] = getMd5Bytes(source);
		int i;
		StringBuffer buf = new StringBuffer("");
		for (int offset = 0; offset < b.length; offset++) {
			i = b[offset];
			if (i < 0)
				i += 256;
			if (i < 16)
				buf.append("0");
			buf.append(Integer.toHexString(i));
		}
//		System.out.println("result: " + buf.toString());// 32位的加密
//		System.out.println("result: " + buf.toString().substring(8, 24));// 16位的加密
		return buf.toString();
	}

	public static byte[] getMd5Bytes(String source) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(source.getBytes("UTF-8"));
			byte b[] = md.digest();
			return b;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static String getTimeKey(String milisec){
		return milisec.substring(6, 9)+milisec.substring(10,13);
	}
	
	/**
	 * 按照加密方法
	 * 1、para按照key进行排序，然后组成字符串
	 * 2、字符串儿的末尾加上key
	 * 3、md5
	 * 4、小写转大写
	 * @author zhou.zhao
	 */
	public static String encryption4JHZF(Map<String,String>para,String key){
		StringBuffer retMsgB = new StringBuffer();
		TreeMap<String,String> tm = new TreeMap<String,String>();
		tm.putAll(para);
		for (Entry<String, String> entry : tm.entrySet()) {
			String mkey = entry.getKey();
			String mvalue = entry.getValue();
			
			if(!StringUtils.isBlank(mkey)&&!StringUtils.isBlank(mvalue)){
				String temValue = new String(mvalue);
				//如果 mvalue 包含转移 \ 去除
				if(temValue.contains("\\")){
					temValue = temValue.replace("\\", "");
				}
				
				retMsgB.append(mkey+"="+temValue+"&");
			}
			
		}
		String retMsg = retMsgB.toString();
		if(retMsg.charAt(retMsg.length()-1)=='&'){
			retMsg = retMsg.substring(0,retMsg.length()-1);
		}
		retMsg = retMsg+key;
		System.out.println("验签字符串为： " + retMsg);
		/** 加密 、转大写 */
		retMsg = getMd5Str(retMsg).toUpperCase();
		System.out.println("加密验签字符串为： " + retMsg);
		return retMsg.toString();
	}

	/**
	 * 验证签名
	 * @param param
	 * @param key
	 * @return
	 */
	public static boolean checkEncryption(JSONObject json,String key,String sign){
		//JSONObject json = JSONObject.fromObject(param);
		Map<String, String> map = new HashMap<String, String>();
		//FastJsonUtil.jsonTOmap(json,map);
		if(encryption4JHZF(map,key).equals(sign)){
			return true;
		}else {
			return false;
		}
	}
	
	
	
	public static void main(String[]args){
		/*Map<String, String> map = new TreeMap<String, String>();
		map.put("aBA", "nba");
		map.put("aaA", "cba");
		map.put("KFC", "kfc");
		map.put("WNBA", "wnba");
	    String str =Md5.encryption4JHZF(map, "asdf");
		System.out.println(Md5.encryption4JHZF(map, "asdf"));
		boolean bo = Md5.checkEncryption(JSONObject.fromObject(map), "asdf", str);
		System.out.println(bo);
		map.put("WNBA", "wnb");
		boolean bo2 = Md5.checkEncryption(JSONObject.fromObject(map), "asdf", str);
		System.out.println(bo2);
		//\"posCati\":\"76339354\"
		String mvalue = "\"posCati\":\"76339354\"";
		if(mvalue.contains("\\")){
			mvalue = mvalue.replace("\\", "");
		}*/
		System.out.println(MD5.getMd5Str("AGNETSIGN"+System.currentTimeMillis()).toUpperCase());
	}
	
}

