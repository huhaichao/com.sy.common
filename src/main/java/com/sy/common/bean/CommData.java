package com.sy.common.bean;

import java.util.List;

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
 * @param <T>
 */
public class CommData<T> {
	private String code="";
	private String msg="";	
	private List<T> data;
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
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
