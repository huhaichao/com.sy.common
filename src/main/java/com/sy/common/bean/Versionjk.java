package com.sy.common.bean;

import java.util.ArrayList;
import java.util.List;

/*
 * 1.接口参数
*操作平台(Android、iOS)
*使用版本
2.接口返回结果
{
 	"code": 1,//成功或者失败标志
"msg": "",//失败时的原因，成功时为""
"data": {//成功时返回的数据集，失败时为""
版本号,
App下载url,
版本描述
}
}
 */
public class Versionjk {
	
	String code="";
	String msg="";	
	protected List<SubVersionjk> data=new ArrayList<SubVersionjk>();
	
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
	public List<SubVersionjk> getData() {
		return data;
	}
	public void setData(List<SubVersionjk> data) {
		this.data = data;
	}

}
