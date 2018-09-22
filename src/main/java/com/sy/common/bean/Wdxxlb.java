package com.sy.common.bean;

import java.util.ArrayList;
import java.util.List;

/**
 *  我的消息列表
		1.接口参数
		*用户id(必填)
		*操作平台(Android、iOS)
		*使用版本
		2.接口返回结果
		{
		 	"code": 1,//成功或者失败标志
		"msg": ""//失败时的原因，成功时为""
		"data": [//成功时返回的数据集，失败时为""
		{
		     		时间1,
		    		"msgs1": [
		    			{
		        			消息id1,
		        			消息内容
		     			},
		       			{
		      				消息id2,
		      				消息内容
		  				}
		      		]
		   		},
		    	{
		    		时间2,
		    		"msgs2": [
		     			{
		        			消息id3,
		        			消息内容
		       			},
		       			{
		          			消息id4,
		          			消息内容
		      			}
		   			]
		    	}
		  	]
		}
		
 * 我的消息列表
 * @author yumeng
 * 
 */
public class Wdxxlb {
	
	String code="";
	String msg="";	
    List<SubWdxxlbsub> data=new ArrayList<SubWdxxlbsub>();
    
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<SubWdxxlbsub> getData() {
		return data;
	}
	public void setData(List<SubWdxxlbsub> data) {
		this.data = data;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

}
