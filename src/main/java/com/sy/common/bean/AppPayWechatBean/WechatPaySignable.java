package com.sy.common.bean.AppPayWechatBean;

import java.io.Serializable;

/**
 * 微信支付协议数据包基类
 * 包含签名sign
 *
 */
public abstract class WechatPaySignable implements Serializable  {

	private static final long serialVersionUID = -3011613066844770293L;
	
	private String sign;
	
	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	@Override
	public String toString() {
		return "WechatPaySignable [sign=" + sign + "]";
	}
}