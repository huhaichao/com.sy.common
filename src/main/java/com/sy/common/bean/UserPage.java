package com.sy.common.bean;

import java.util.Date;

public class UserPage extends Page {

	/**
	 * User会员信息表需要传递的参数
	 */
	private static final long serialVersionUID = 1L;

	private Date starDate;// 开始日期
	private Date endDate;// 结束日期
	private int userSex;// 用户性别
	private int intEgral;// 积分
	private int userStatus;// 状态
	private String userName;// 用户名

	public Date getStarDate() {
		return starDate;
	}

	public void setStarDate(Date starDate) {
		this.starDate = starDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getUserSex() {
		return userSex;
	}

	public void setUserSex(int userSex) {
		this.userSex = userSex;
	}

	public int getIntEgral() {
		return intEgral;
	}

	public void setIntEgral(int intEgral) {
		this.intEgral = intEgral;
	}

	public int getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
