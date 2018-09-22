package com.sy.common.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Xxssjk implements Serializable {
	/*
		 *1.接口参数
		*经度(必填)
		*维度(必填)
		*失物类型(失物、拾物、人，必填)
		*详细种类(当失物类型为人时，此种类是男/女，当失物类型为物时，此种类是物的具体类型，如：动物/生活用品等等)
		*失物名称
		*搜索日期
		*操作平台(Android、iOS)
		*使用版本
		2.接口返回结果
		{
		 	"code": 1,//成功或者失败标志
		"msg": "",//失败时的原因，成功时为""
		"data": [//成功时返回的数据集，失败时为""
		{
		    	失物id,//用于查看详情
		    	失物种类,//当搜索类型是人的时候，用于展示性别
		    	失物标题,//用于点击位置的时候显示物品简单的描述
				丢失日期
			},
		{
		    	失物id,//用于查看详情
		    	失物种类,//当搜索类型是人的时候，用于展示性别
		    	失物标题,//用于点击位置的时候显示物品简单的描述
		丢失日期
			}
		]
		}

 */
	String code="";
	String msg="";	
	protected List<Subxxssjk> data=new ArrayList<Subxxssjk>();
	
	public Xxssjk() {
		// TODO Auto-generated constructor stub		
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

	public List<Subxxssjk> getData() {
		return data;
	}

	public void setData(List<Subxxssjk> data) {
		this.data = data;
	}
	
	
	
	

}
