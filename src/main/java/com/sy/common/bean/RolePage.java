package com.sy.common.bean;

import java.util.Date;

public class RolePage extends Page{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date starDate;// 开始日期
	private Date endDate;// 结束日期
	private String roleName;//角色名称
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
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}
