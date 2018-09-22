package com.sy.common.bean;



public class SubPurseDetailjk {

	/*
	 * { "code": 1,//成功或者失败标志 "msg": ""//失败时的原因，成功时为"" "data":
	 * [//成功时返回的数据集，失败时为"" { 时间1(月), 合计1, "msgs1": [ { 交易金额, 交易时间, 交易类型 }, {
	 * 交易金额, 交易时间, 交易类型 } ] }, { 时间2(月), 合计2, "msgs2": [ { 交易金额, 交易时间, 交易类型 }, {
	 * 交易金额, 交易时间, 交易类型 } ] } ] }
	 * 
	 */
	String dealType = "";
	String dealDate = "";
	String dealAmount = "";

	public String getDealType() {
		return dealType;
	}

	public void setDealType(String dealType) {
		this.dealType = dealType;
	}

	public String getDealDate() {
		return dealDate;
	}

	public void setDealDate(String dealDate) {
		this.dealDate = dealDate;
	}

	public String getDealAmount() {
		return dealAmount;
	}

	public void setDealAmount(String dealAmount) {
		this.dealAmount = dealAmount;
	}

}
