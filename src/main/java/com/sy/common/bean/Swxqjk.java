package com.sy.common.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 3.拾物详情接口
 * @author yumeng
 *
 */
public class Swxqjk {
	/*
	 *  接口参数
		*失物id(必填)
		*失物类型(失物、拾物、人，必填)
		*操作平台(Android、iOS)
		*使用版本
		2.接口返回结果
		{
			"code": 1,//成功或者失败标志
			"msg": "",//失败时的原因，成功时为""
			"data": {//成功时返回的数据集，失败时为""
			是否悬赏,
			详细内容的URL,//展示详细内容,可以通过调用后台的一个静态web页来展示详情
			联系人电话,
			消息发布人的聊天账号,//环信中的聊天账号
			消息发布人的用户名,
			消息发布人的头像URI,//如果在修改用户头像的时候，后台可以同步修改环信中用户的头像，这里可以不传
			消息状态 //用于判断是否可以点击“确认归还”
		  }
		}
	 */
	String code="";
	String msg="";	
	protected List<SubSwxqjk> data=new ArrayList<SubSwxqjk>();
	
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
	public List<SubSwxqjk> getData() {
		return data;
	}
	public void setData(List<SubSwxqjk> data) {
		this.data = data;
	}
	
}
