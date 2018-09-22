package com.sy.common.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Syxsjk implements Serializable {
/*
 * 1.首页显示接口
		1.接口参数
		*经度(必填)
		*维度(必填)
		*失物类型(失物、拾物、人，非必填)
		*操作平台(Android、iOS)
		*使用版本
		2.接口返回结果
		{
		 	"code": 1,//成功或者失败标志
		    "msg": "",//失败时的原因，成功时为""
		    "data": [//成功时返回的数据集，失败时为""
		{
		    	失物id,//用于查看详情
		    	失物类型,//失物、拾物、人
		    	失物标题,//用于点击位置的时候显示物品简单的描述
				失物经度,
				失物纬度
		 	},
		{
		    	失物id,//用于查看详情
		    	失物类型,//失物、拾物、人
		    	失物标题,//用于点击位置的时候显示物品简单的描述
				失物经度,
				失物纬度
		 	}
		       ]
		}
 */
	String code="";
	String msg="";	
	protected List<SubSyxsjk> data=new ArrayList<SubSyxsjk>();
	
	public Syxsjk() {
		// TODO Auto-generated constructor stub		
	}
	
	public void setData(List<SubSyxsjk> data) {
		this.data = data;
	}
	
	public List<SubSyxsjk> getData() {
		return data;
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
