package com.sy.common.Exception;

public class AppPayWechatServiceException extends Exception{
	
	private static final long serialVersionUID = -4990302734672853683L;
	
	public AppPayWechatServiceException() {
		super();
	}
	/**
	 * 转换APP微信支付异常码
	 * @author lizhenzhong 2017.05.28
	 */
	public AppPayWechatServiceException(String errorMsg){
		super(errorMsg);
	}
	public AppPayWechatServiceException(String errorMsg,Exception e){
		super(errorMsg,e);
	}
}
