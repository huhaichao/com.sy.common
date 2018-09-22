package com.sy.common.bean;

import com.sy.common.enums.MessageCodeConstant;

/**
 * 返回对象实体
 * @author huchao
 *
 */
public class RespondBeanAndBalance {
	
	//http请求返回状态码
	private  int  code ;
	//http 请求返回信息
	private  String  msg;
	//返回的数据
	private  Object  Data;
	//积分  钱包 余额
	private  Object balance;
	
	//时间戳
	/*private  Long     currentDate;
	//结果异常吗
	private  ResultMessage  resultMessage;*/
	
	
	public String getMsg() {
		return msg;
	}




	public void setMsg(String msg) {
		this.msg = msg;
	}




	public int getCode() {
		return code;
	}




	public void setCode(int code) {
		this.code = code;
	}




	public Object getData() {
		return Data;
	}




	public void setData(Object data) {
		Data = data;
	}
	
	

	public Object getBalance() {
		return balance;
	}




	public void setBalance(Object balance) {
		this.balance = balance;
	}



	//内部类，处理结果码
	protected  class  ResultMessage{
		
		private String resultCode ;
		
		private String resultMessage;
		
		public   ResultMessage (String resultCode,String  resultMessage){
			this.resultCode=resultCode;
			this.resultMessage = resultMessage;
		}

		public   ResultMessage (MessageCodeConstant  messageCodeConstant){
			this.resultCode=messageCodeConstant.getResultCode();
			this.resultMessage = messageCodeConstant.getResultCode();
		}
		
		public String getResultCode() {
			return resultCode;
		}

		public void setResultCode(String resultCode) {
			this.resultCode = resultCode;
		}

		public String getResultMessage() {
			return resultMessage;
		}

		public void setResultMessage(String resultMessage) {
			this.resultMessage = resultMessage;
		}
		
		
	}


	public RespondBeanAndBalance(int code, Object data, ResultMessage resultMessage) {
		super();
		this.code = code;
		this.msg = resultMessage.getResultCode();
		Data = data;
	} 
	
	public RespondBeanAndBalance(Object data, ResultMessage resultMessage) {
		super();
		this.code = 1;
		Data = data;
		this.msg = resultMessage.getResultCode();
	} 
	
	
	public RespondBeanAndBalance(Object data, Object balance,MessageCodeConstant messageCodeConstant) {
		super();
		this.code = 1;
		this.balance = balance;
		Data = data;
		this.msg = new ResultMessage(messageCodeConstant).getResultCode();
	} 
	
	public RespondBeanAndBalance(Object data, MessageCodeConstant messageCodeConstant) {
		super();
		this.code = 1;
		Data = data;
		this.msg = new ResultMessage(messageCodeConstant).getResultCode();
	} 
	
	public RespondBeanAndBalance(Object data) {
		super();
		this.code = 1;
		Data = data;
		this.msg = "";
	} 
	
	public RespondBeanAndBalance( MessageCodeConstant messageCodeConstant) {
		super();
		this.code = 0;
		Data = null;
		this.msg = new ResultMessage(messageCodeConstant).getResultCode();
	} 
	
	
}
