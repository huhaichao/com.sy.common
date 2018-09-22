package com.sy.common.bean;

import java.io.Serializable;

public class Subxxssjk implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 *  	        失物id,//用于查看详情
		    	失物种类,//当搜索类型是人的时候，用于展示性别
		    	失物标题,//用于点击位置的时候显示物品简单的描述
				丢失日期
	 */
	String swid=" ";
	String swlx=" ";
	String swbt=" ";
	String swsj=" ";
	
	public String getSwid() {
		return swid;
	}
	public void setSwid(String swid) {
		this.swid = swid;
	}
	public String getSwlx() {
		return swlx;
	}
	public void setSwlx(String swlx) {
		this.swlx = swlx;
	}
	public String getSwbt() {
		return swbt;
	}
	public void setSwbt(String swbt) {
		this.swbt = swbt;
	}
	public String getSwsj() {
		return swsj;
	}
	public void setSwsj(String swsj) {
		this.swsj = swsj;
	}
	

}
