package com.sy.common.bean;

import java.util.ArrayList;
import java.util.List;

public class SubPursejk {

	/**
	 * 
	 */
	String month = "";// 月份
	String sum = "";// 合计金额
	protected List<SubPurseDetailjk> msg = new ArrayList<SubPurseDetailjk>();

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getSum() {
		return sum;
	}

	public void setSum(String sum) {
		this.sum = sum;
	}

	public List<SubPurseDetailjk> getMsg() {
		return msg;
	}

	public void setMsg(List<SubPurseDetailjk> msg) {
		this.msg = msg;
	}

	

}
