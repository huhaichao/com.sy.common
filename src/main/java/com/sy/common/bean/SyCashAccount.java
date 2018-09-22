package com.sy.common.bean;

import java.math.BigDecimal;
import java.util.Date;

public class SyCashAccount {
    private Integer tSyCashAccountId;

    private String tSyAccount;

    private String tSyCashAccountNo;

    private BigDecimal tSyCashAmount;

    private String tSyCashType;

    private String tSyCashOutorinStatus;

    private String tSyTreadTreadno;

    private String tSyPsOrderno;

    private Date tSyCashCreateDate;

    private String tSyMessageId;

    private Date tSyDeleteDate;

    private String tSyDeleteStatus;

    public Integer gettSyCashAccountId() {
        return tSyCashAccountId;
    }

    public void settSyCashAccountId(Integer tSyCashAccountId) {
        this.tSyCashAccountId = tSyCashAccountId;
    }

    public String gettSyAccount() {
        return tSyAccount;
    }

    public void settSyAccount(String tSyAccount) {
        this.tSyAccount = tSyAccount == null ? null : tSyAccount.trim();
    }

    public String gettSyCashAccountNo() {
        return tSyCashAccountNo;
    }

    public void settSyCashAccountNo(String tSyCashAccountNo) {
        this.tSyCashAccountNo = tSyCashAccountNo == null ? null : tSyCashAccountNo.trim();
    }

    public BigDecimal gettSyCashAmount() {
        return tSyCashAmount;
    }

    public void settSyCashAmount(BigDecimal tSyCashAmount) {
        this.tSyCashAmount = tSyCashAmount;
    }

    public String gettSyCashType() {
        return tSyCashType;
    }

    public void settSyCashType(String tSyCashType) {
        this.tSyCashType = tSyCashType == null ? null : tSyCashType.trim();
    }

    public String gettSyCashOutorinStatus() {
        return tSyCashOutorinStatus;
    }

    public void settSyCashOutorinStatus(String tSyCashOutorinStatus) {
        this.tSyCashOutorinStatus = tSyCashOutorinStatus == null ? null : tSyCashOutorinStatus.trim();
    }

    public String gettSyTreadTreadno() {
        return tSyTreadTreadno;
    }

    public void settSyTreadTreadno(String tSyTreadTreadno) {
        this.tSyTreadTreadno = tSyTreadTreadno == null ? null : tSyTreadTreadno.trim();
    }

    public String gettSyPsOrderno() {
        return tSyPsOrderno;
    }

    public void settSyPsOrderno(String tSyPsOrderno) {
        this.tSyPsOrderno = tSyPsOrderno == null ? null : tSyPsOrderno.trim();
    }

    public Date gettSyCashCreateDate() {
        return tSyCashCreateDate;
    }

    public void settSyCashCreateDate(Date tSyCashCreateDate) {
        this.tSyCashCreateDate = tSyCashCreateDate;
    }

    public String gettSyMessageId() {
        return tSyMessageId;
    }

    public void settSyMessageId(String tSyMessageId) {
        this.tSyMessageId = tSyMessageId == null ? null : tSyMessageId.trim();
    }

    public Date gettSyDeleteDate() {
        return tSyDeleteDate;
    }

    public void settSyDeleteDate(Date tSyDeleteDate) {
        this.tSyDeleteDate = tSyDeleteDate;
    }

    public String gettSyDeleteStatus() {
        return tSyDeleteStatus;
    }

    public void settSyDeleteStatus(String tSyDeleteStatus) {
        this.tSyDeleteStatus = tSyDeleteStatus == null ? null : tSyDeleteStatus.trim();
    }
}