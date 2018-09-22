package com.sy.common.bean;

import java.util.Date;

public class SubCreditjk {

	/**
	 * 
	 */
	Integer creditId = 0;// 积分id
	String creditReason = "";// 积分原因
	Integer creditNumber = 0;//积分数量
	String    creditDate;//积分生成日期
	public Integer getCreditId() {
		return creditId;
	}
	public void setCreditId(Integer creditId) {
		this.creditId = creditId;
	}
	public String getCreditReason() {
		return creditReason;
	}
	public void setCreditReason(String creditReason) {
		this.creditReason = creditReason;
	}
	public Integer getCreditNumber() {
		return creditNumber;
	}
	public void setCreditNumber(Integer creditNumber) {
		this.creditNumber = creditNumber;
	}
	public String getCreditDate() {
		return creditDate;
	}
	public void setCreditDate(String creditDate) {
		this.creditDate = creditDate;
	}
	
	
}
