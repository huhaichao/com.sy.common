package com.sy.common.bean;

import java.util.Date;

/**
 * 版本信息表需要传递的参数
 * @author zbb
 *
 */
public class VersionPage extends Page {
	
	private static final long serialVersionUID = 1L;

	private Date starDate;// 开始日期
	private Date endDate;// 结束日期
	private String versionNo;//版本号
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
	public String getVersionNo() {
		return versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
}
