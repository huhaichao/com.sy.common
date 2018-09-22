package com.sy.common.bean;

import java.util.ArrayList;
import java.util.List;

/*1.接口参数
*用户id(必填)
*操作平台(Android、iOS)
*使用版本
2.接口返回结果
{
 	"code": 1,//成功或者失败标志
"msg": "",//失败时的原因，成功时为""
"data": {//成功时返回的数据集，失败时为""
余额,
账户,
状态//是否冻结,挂失
}
}


 */
public class Creditjk {

	String code = "";
	String msg = "";
	protected List<SubCreditjk> data = new ArrayList<SubCreditjk>();

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

	public List<SubCreditjk> getData() {
		return data;
	}

	public void setData(List<SubCreditjk> data) {
		this.data = data;
	}

}
