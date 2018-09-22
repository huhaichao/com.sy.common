package com.sy.common.busibean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SyMessagePush {
    private Integer tSyMessagePushId;

    private String tSyPushWasPeople;

    private String tSyPushPeople;

    private String tSyTheme;

    private Date tSyPushDate;

    private String tSyPushContent;

    private String tSyBz1;

    private String tSyBz2;

    private String tSyDelStatus;

    private Date tSyDelDate;
    
    private String tSyRwStatus;

    public Integer gettSyMessagePushId() {
        return tSyMessagePushId;
    }

    public void settSyMessagePushId(Integer tSyMessagePushId) {
        this.tSyMessagePushId = tSyMessagePushId;
    }

    public String gettSyPushWasPeople() {
        return tSyPushWasPeople;
    }

    public void settSyPushWasPeople(String tSyPushWasPeople) {
        this.tSyPushWasPeople = tSyPushWasPeople == null ? null : tSyPushWasPeople.trim();
    }

    public String gettSyPushPeople() {
        return tSyPushPeople;
    }

    public void settSyPushPeople(String tSyPushPeople) {
        this.tSyPushPeople = tSyPushPeople == null ? null : tSyPushPeople.trim();
    }

    public String gettSyTheme() {
        return tSyTheme;
    }

    public void settSyTheme(String tSyTheme) {
        this.tSyTheme = tSyTheme == null ? null : tSyTheme.trim();
    }

    public Date gettSyPushDate() {
        return tSyPushDate;
    }

    public void settSyPushDate(Date tSyPushDate) {
        this.tSyPushDate = tSyPushDate;
    }

    public String gettSyPushContent() {
        return tSyPushContent;
    }

    public void settSyPushContent(String tSyPushContent) {
        this.tSyPushContent = tSyPushContent == null ? null : tSyPushContent.trim();
    }

    public String gettSyBz1() {
        return tSyBz1;
    }

    public void settSyBz1(String tSyBz1) {
        this.tSyBz1 = tSyBz1 == null ? null : tSyBz1.trim();
    }

    public String gettSyBz2() {
        return tSyBz2;
    }

    public void settSyBz2(String tSyBz2) {
        this.tSyBz2 = tSyBz2 == null ? null : tSyBz2.trim();
    }

    public String gettSyDelStatus() {
        return tSyDelStatus;
    }

    public void settSyDelStatus(String tSyDelStatus) {
        this.tSyDelStatus = tSyDelStatus == null ? null : tSyDelStatus.trim();
    }

    public Date gettSyDelDate() {
        return tSyDelDate;
    }

    public void settSyDelDate(Date tSyDelDate) {
        this.tSyDelDate = tSyDelDate;
    }

	public String gettSyRwStatus() {
		return tSyRwStatus;
	}

	public void settSyRwStatus(String tSyRwStatus) {
		this.tSyRwStatus = tSyRwStatus;
	}

    
}