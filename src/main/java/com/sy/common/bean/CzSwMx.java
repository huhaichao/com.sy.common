package com.sy.common.bean;

import java.util.List;
import java.util.Map;


/**
 * 验证码返回值
 * 暂且不使用该类进行测试 验证码返回
 * @author yxx
 * 	{
	"code": 1,//成功或者失败标志
	"msg": "",//失败时的原因，成功时为""
	"data": {//成功时返回的数据集，失败时为""
	      验证码
	}
 */
public class CzSwMx {
	String code="";
	String msg="";	
	
	protected Object data;
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
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


	
}
