package com.sy.common.bean;

import java.io.Serializable;

public class SubSyxsjk implements Serializable{

	/*
	 *  	           失物id,//用于查看详情
		    	失物类型,//失物、拾物、人
		    	失物标题,//用于点击位置的时候显示物品简单的描述
				失物经度,
				失物纬度
	 */
	String swid=" ";
	String swlx=" ";
	String swbt=" ";
	String swjd=" ";
	String swwd=" ";
	
	public SubSyxsjk() {
		// TODO Auto-generated constructor stub
	}
	
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

	public String getSwjd() {
		return swjd;
	}

	public void setSwjd(String swjd) {
		this.swjd = swjd;
	}

	public String getSwwd() {
		return swwd;
	}

	public void setSwwd(String swwd) {
		this.swwd = swwd;
	}



}
