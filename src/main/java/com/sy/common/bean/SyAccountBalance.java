package com.sy.common.bean;

import java.math.BigDecimal;
import java.util.Date;

public class SyAccountBalance {
    private Integer tSyBalanceId;

    private String tSyUserId;

    private String tSyAccount;

    private BigDecimal tSyMoney;

    private Date tSyDate;

    private String tSyBz1;

    private String tSyBz2;

    private Date tSyUpdateDate;

    private String tSyStatus;

    private BigDecimal tSyCoolMoney;

    private Date tSyCoolDate;

    public Integer gettSyBalanceId() {
        return tSyBalanceId;
    }

    public void settSyBalanceId(Integer tSyBalanceId) {
        this.tSyBalanceId = tSyBalanceId;
    }

    public String gettSyUserId() {
        return tSyUserId;
    }

    public void settSyUserId(String tSyUserId) {
        this.tSyUserId = tSyUserId == null ? null : tSyUserId.trim();
    }

    public String gettSyAccount() {
        return tSyAccount;
    }

    public void settSyAccount(String tSyAccount) {
        this.tSyAccount = tSyAccount == null ? null : tSyAccount.trim();
    }

    public BigDecimal gettSyMoney() {
        return tSyMoney;
    }

    public void settSyMoney(BigDecimal tSyMoney) {
        this.tSyMoney = tSyMoney;
    }

    public Date gettSyDate() {
        return tSyDate;
    }

    public void settSyDate(Date tSyDate) {
        this.tSyDate = tSyDate;
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

    public Date gettSyUpdateDate() {
        return tSyUpdateDate;
    }

    public void settSyUpdateDate(Date tSyUpdateDate) {
        this.tSyUpdateDate = tSyUpdateDate;
    }

    public String gettSyStatus() {
        return tSyStatus;
    }

    public void settSyStatus(String tSyStatus) {
        this.tSyStatus = tSyStatus == null ? null : tSyStatus.trim();
    }

    public BigDecimal gettSyCoolMoney() {
        return tSyCoolMoney;
    }

    public void settSyCoolMoney(BigDecimal tSyCoolMoney) {
        this.tSyCoolMoney = tSyCoolMoney ;
    }

    public Date gettSyCoolDate() {
        return tSyCoolDate;
    }

    public void settSyCoolDate(Date tSyCoolDate) {
        this.tSyCoolDate = tSyCoolDate;
    }
}