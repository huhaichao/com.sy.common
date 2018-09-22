package com.sy.common.bean;

import java.util.ArrayList;
import java.util.List;

public class Wdxxjk {
	String code="";
	String msg="";	
	protected List<SubWdxxjk> data=new ArrayList<SubWdxxjk>();
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
	public List<SubWdxxjk> getData() {
		return data;
	}
	public void setData(List<SubWdxxjk> data) {
		this.data = data;
	}
	
}
