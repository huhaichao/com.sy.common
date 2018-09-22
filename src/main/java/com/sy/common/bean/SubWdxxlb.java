package com.sy.common.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 我的消息列表
 * @author yumeng
 *
 */
public class SubWdxxlb {

	/*
	 * 时间2,
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
	 */
	
	String times=new String();
	List<SubWdxxlbsub> msgs=new ArrayList<SubWdxxlbsub>();


	
	public String getTimes() {
		return times;
	}
	public void setTimes(String times) {
		this.times = times;
	}
	public List<SubWdxxlbsub> getMsgs() {
		return msgs;
	}
	public void setMsgs(List<SubWdxxlbsub> msgs) {
		this.msgs = msgs;
	}
	
	
}
