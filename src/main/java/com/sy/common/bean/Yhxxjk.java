package com.sy.common.bean;

public class Yhxxjk {
	String code="";
	String msg="";	
	protected SubYhxxjk data=new SubYhxxjk();
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public SubYhxxjk getData() {
		return data;
	}
	public void setData(SubYhxxjk subyhxx) {
		this.data = subyhxx;
	}
}
