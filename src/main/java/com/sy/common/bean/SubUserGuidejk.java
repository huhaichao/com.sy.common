package com.sy.common.bean;

public class SubUserGuidejk {

	/*
	 * "data": {//成功时返回的数据集，失败时为"" 用户指南id, 平台版本号, 版本号, 用户指南问题名称 , 用户指南问题代码,用户指南问题代码,使用状态,审核状态,备用字段, }
	 */

	String tSyUserguideId;

	String tSyPlatCode;

	String tSyVersionNumber;

	String tSyUserguideName;

	String tSyUserguideCode;

	String tSyUserguidefId;//父节点代码

	String tSyUserguideUsertext;

	String tSyUserguideContext;

	Integer tSyUserguideState;

	Integer tSyUserguideCheck;

	String tSyBz1;

	String tSyBz2;

	public String gettSyUserguideId() {
		return tSyUserguideId;
	}

	public void settSyUserguideId(String tSyUserguideId) {
		this.tSyUserguideId = tSyUserguideId;
	}

	public String gettSyPlatCode() {
		return tSyPlatCode;
	}

	public void settSyPlatCode(String tSyPlatCode) {
		this.tSyPlatCode = tSyPlatCode;
	}

	public String gettSyVersionNumber() {
		return tSyVersionNumber;
	}

	public void settSyVersionNumber(String tSyVersionNumber) {
		this.tSyVersionNumber = tSyVersionNumber;
	}

	public String gettSyUserguideName() {
		return tSyUserguideName;
	}

	public void settSyUserguideName(String tSyUserguideName) {
		this.tSyUserguideName = tSyUserguideName;
	}

	public String gettSyUserguideCode() {
		return tSyUserguideCode;
	}

	public void settSyUserguideCode(String tSyUserguideCode) {
		this.tSyUserguideCode = tSyUserguideCode;
	}

	public String gettSyUserguidefId() {
		return tSyUserguidefId;
	}

	public void settSyUserguidefId(String tSyUserguidefId) {
		this.tSyUserguidefId = tSyUserguidefId;
	}

	public String gettSyUserguideUsertext() {
		return tSyUserguideUsertext;
	}

	public void settSyUserguideUsertext(String tSyUserguideUsertext) {
		this.tSyUserguideUsertext = tSyUserguideUsertext;
	}

	public String gettSyUserguideContext() {
		return tSyUserguideContext;
	}

	public void settSyUserguideContext(String tSyUserguideContext) {
		this.tSyUserguideContext = tSyUserguideContext;
	}

	public Integer gettSyUserguideState() {
		return tSyUserguideState;
	}

	public void settSyUserguideState(Integer tSyUserguideState) {
		this.tSyUserguideState = tSyUserguideState;
	}

	public Integer gettSyUserguideCheck() {
		return tSyUserguideCheck;
	}

	public void settSyUserguideCheck(Integer tSyUserguideCheck) {
		this.tSyUserguideCheck = tSyUserguideCheck;
	}

	public String gettSyBz1() {
		return tSyBz1;
	}

	public void settSyBz1(String tSyBz1) {
		this.tSyBz1 = tSyBz1;
	}

	public String gettSyBz2() {
		return tSyBz2;
	}

	public void settSyBz2(String tSyBz2) {
		this.tSyBz2 = tSyBz2;
	}
	
	

}
