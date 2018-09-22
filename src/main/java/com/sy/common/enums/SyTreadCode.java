package com.sy.common.enums;

public enum SyTreadCode {
	
	INIT  ("init","订单初始化") ,
	SUCCESS ("success","订单支付成功"),
	SETTLE ("settle","订单结算"),
	FAIL ("fail","订单支付失败"),
	CLOSE ("close","订单关闭"),
	FINISHED("finished","订单完成"),
	
	//阿里支付结果吗转换成拾缘 结果码
	ALIPAY_WAIT_BUYER_PAY("wait","等待支付"),
	ALIPAY_TRADE_CLOSED("close","未付款交易超时关闭，或支付完成后全额退款"),
	ALIPAY_TRADE_SUCCESS("success","交易支付成功"),
	ALIPAY_TRADE_FINISHED("finished","交易结束，不可退款"),
	
	 ALIPAY_10000 ("success","支付宝 请求成功"),
	 ALIPAY_20000 ("fail","支付宝 服务不可用"),
	 ALIPAY_20001 ("fail","支付宝 授权权限不足"),
	 ALIPAY_40001 ("fail","支付宝 缺少必选参数"),
	 ALIPAY_40002 ("fail","支付宝 非法的参数"),
	 ALIPAY_40004 ("fail","支付宝 业务处理失败"),
	 ALIPAY_40006 ("fail","支付宝 权限不足"),
	;
	
	private  String  syTreadCode;
	
	private String  syTReadMessage;

	public String getSyTreadCode() {
		return syTreadCode;
	}

	public String getSyTReadMessage() {
		return syTReadMessage;
	}

	private SyTreadCode(String syTreadCode, String syTReadMessage) {
		this.syTreadCode = syTreadCode;
		this.syTReadMessage = syTReadMessage;
	}
	
	
}