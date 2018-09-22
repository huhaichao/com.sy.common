package com.sy.common.bean;

/*用户登录接口
 *  .接口参数
	*手机号(必填)
	*密码(必填)
	*操作平台(Android、iOS)
	*使用版本
	2.接口返回结果
	{
	"code": 1,//成功或者失败标志
	"msg": "",//失败时的原因，成功时为""
	"data": {//成功时返回的数据集，失败时为""
	用户id,
	用户名,//如果用手机号作为用户名,可以不传
	用户积分,
	聊天账号,
	用户的头像URI,
	用户状态
	}
	}
 */
public class Dljk {
	
	String code="";
	String msg="";	
	protected SubDljk data=new SubDljk();
	
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
	public SubDljk getData() {
		return data;
	}
	public void setData(SubDljk data) {
		this.data = data;
	}
	

}
