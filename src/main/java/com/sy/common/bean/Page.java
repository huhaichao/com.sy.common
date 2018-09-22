package com.sy.common.bean;

import java.io.Serializable;
public class Page implements Serializable {

	private static final long serialVersionUID = 768549219446295665L;
	private int pageSize; // 总条数
	private int pageRow;// 每页显示的条数
	private int intPage;// 页数
	private int pageNo; // 当前页显示页

	public int getPageRow() {
		return pageRow;
	}

	public void setPageRow(int pageRow) {
		this.pageRow = pageRow;
	}

	public int getIntPage() {
		return intPage;
	}

	public void setIntPage(int intPage) {
		this.intPage = intPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

}
