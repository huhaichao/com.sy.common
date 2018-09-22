package com.sy.common.bean;

import java.util.Date;

public class SyTread {
    private Integer tSyTreadId;

    private String tSyTreadOutaccount;

    private String tSyTreadInaccount;

    private Double tSyTreadAmount;

    private Date tSyTreadCreatedate;

    private String tSyTreadStatus;

    private Date tSyTreadCompeletedate;

    private String tSyTreadTreadno;

    private Integer tSyMessageId;

    private String tSyTreadType;

    private Date tSyDeleteDate;

    private String tSyDeleleStatus;

    public Integer gettSyTreadId() {
        return tSyTreadId;
    }

    public void settSyTreadId(Integer tSyTreadId) {
        this.tSyTreadId = tSyTreadId;
    }

    public String gettSyTreadOutaccount() {
        return tSyTreadOutaccount;
    }

    public void settSyTreadOutaccount(String tSyTreadOutaccount) {
        this.tSyTreadOutaccount = tSyTreadOutaccount == null ? null : tSyTreadOutaccount.trim();
    }

    public String gettSyTreadInaccount() {
        return tSyTreadInaccount;
    }

    public void settSyTreadInaccount(String tSyTreadInaccount) {
        this.tSyTreadInaccount = tSyTreadInaccount == null ? null : tSyTreadInaccount.trim();
    }

    public Double gettSyTreadAmount() {
        return tSyTreadAmount;
    }

    public void settSyTreadAmount(Double tSyTreadAmount) {
        this.tSyTreadAmount = tSyTreadAmount;
    }

    public Date gettSyTreadCreatedate() {
        return tSyTreadCreatedate;
    }

    public void settSyTreadCreatedate(Date tSyTreadCreatedate) {
        this.tSyTreadCreatedate = tSyTreadCreatedate;
    }

    public String gettSyTreadStatus() {
        return tSyTreadStatus;
    }

    public void settSyTreadStatus(String tSyTreadStatus) {
        this.tSyTreadStatus = tSyTreadStatus == null ? null : tSyTreadStatus.trim();
    }

    public Date gettSyTreadCompeletedate() {
        return tSyTreadCompeletedate;
    }

    public void settSyTreadCompeletedate(Date tSyTreadCompeletedate) {
        this.tSyTreadCompeletedate = tSyTreadCompeletedate;
    }

    public String gettSyTreadTreadno() {
        return tSyTreadTreadno;
    }

    public void settSyTreadTreadno(String tSyTreadTreadno) {
        this.tSyTreadTreadno = tSyTreadTreadno == null ? null : tSyTreadTreadno.trim();
    }

    public Integer gettSyMessageId() {
        return tSyMessageId;
    }

    public void settSyMessageId(Integer tSyMessageId) {
        this.tSyMessageId = tSyMessageId;
    }

    public String gettSyTreadType() {
        return tSyTreadType;
    }

    public void settSyTreadType(String tSyTreadType) {
        this.tSyTreadType = tSyTreadType == null ? null : tSyTreadType.trim();
    }

    public Date gettSyDeleteDate() {
        return tSyDeleteDate;
    }

    public void settSyDeleteDate(Date tSyDeleteDate) {
        this.tSyDeleteDate = tSyDeleteDate;
    }

    public String gettSyDeleleStatus() {
        return tSyDeleleStatus;
    }

    public void settSyDeleleStatus(String tSyDeleleStatus) {
        this.tSyDeleleStatus = tSyDeleleStatus == null ? null : tSyDeleleStatus.trim();
    }
}