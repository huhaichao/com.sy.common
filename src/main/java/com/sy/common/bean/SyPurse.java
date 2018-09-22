package com.sy.common.bean;

import java.math.BigDecimal;
import java.util.Date;

public class SyPurse {
    private Integer tSyPurseId;

    private String tSyAccount;

    private String tSyBusinessType;

    private BigDecimal tSyMoney;

    private BigDecimal tSyMustsBalance;

    private String tSyFinancedAccount;

    private String tSyFinanced;

    private String tSyBz1;

    private String tSyBz2;

    private String tSyPsOrderno;

    private String tSyPsTreadno;

    private Date tSyPsCtratetime;

    private Date tSyPsCompletetime;

    private String tSyPsStatus;

    private String tSyPsOutaccount;

    private String tSyPsDelete;

    private String tSyPsRefundStatus;

    private BigDecimal tSyPsRefundMoney;

    private Date tSyPsRefundDate;

    private String tSyPsRefundOrderno;
    
    private String tSyPsRrefundWay;

    public String gettSyPsRrefundWay() {
		return tSyPsRrefundWay;
	}

	public void settSyPsRrefundWay(String tSyPsRrefundWay) {
		this.tSyPsRrefundWay = tSyPsRrefundWay;
	}

	public Integer gettSyPurseId() {
        return tSyPurseId;
    }

    public void settSyPurseId(Integer tSyPurseId) {
        this.tSyPurseId = tSyPurseId;
    }

    public String gettSyAccount() {
        return tSyAccount;
    }

    public void settSyAccount(String tSyAccount) {
        this.tSyAccount = tSyAccount == null ? null : tSyAccount.trim();
    }

    public String gettSyBusinessType() {
        return tSyBusinessType;
    }

    public void settSyBusinessType(String tSyBusinessType) {
        this.tSyBusinessType = tSyBusinessType == null ? null : tSyBusinessType.trim();
    }

    public BigDecimal gettSyMoney() {
        return tSyMoney;
    }

    public void settSyMoney(BigDecimal tSyMoney) {
        this.tSyMoney = tSyMoney;
    }

    public BigDecimal gettSyMustsBalance() {
        return tSyMustsBalance;
    }

    public void settSyMustsBalance(BigDecimal tSyMustsBalance) {
        this.tSyMustsBalance = tSyMustsBalance;
    }

    public String gettSyFinancedAccount() {
        return tSyFinancedAccount;
    }

    public void settSyFinancedAccount(String tSyFinancedAccount) {
        this.tSyFinancedAccount = tSyFinancedAccount == null ? null : tSyFinancedAccount.trim();
    }

    public String gettSyFinanced() {
        return tSyFinanced;
    }

    public void settSyFinanced(String tSyFinanced) {
        this.tSyFinanced = tSyFinanced == null ? null : tSyFinanced.trim();
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

    public String gettSyPsOrderno() {
        return tSyPsOrderno;
    }

    public void settSyPsOrderno(String tSyPsOrderno) {
        this.tSyPsOrderno = tSyPsOrderno == null ? null : tSyPsOrderno.trim();
    }

    public String gettSyPsTreadno() {
        return tSyPsTreadno;
    }

    public void settSyPsTreadno(String tSyPsTreadno) {
        this.tSyPsTreadno = tSyPsTreadno == null ? null : tSyPsTreadno.trim();
    }

    public Date gettSyPsCtratetime() {
        return tSyPsCtratetime;
    }

    public void settSyPsCtratetime(Date tSyPsCtratetime) {
        this.tSyPsCtratetime = tSyPsCtratetime;
    }

    public Date gettSyPsCompletetime() {
        return tSyPsCompletetime;
    }

    public void settSyPsCompletetime(Date tSyPsCompletetime) {
        this.tSyPsCompletetime = tSyPsCompletetime;
    }

    public String gettSyPsStatus() {
        return tSyPsStatus;
    }

    public void settSyPsStatus(String tSyPsStatus) {
        this.tSyPsStatus = tSyPsStatus == null ? null : tSyPsStatus.trim();
    }

    public String gettSyPsOutaccount() {
        return tSyPsOutaccount;
    }

    public void settSyPsOutaccount(String tSyPsOutaccount) {
        this.tSyPsOutaccount = tSyPsOutaccount == null ? null : tSyPsOutaccount.trim();
    }

    public String gettSyPsDelete() {
        return tSyPsDelete;
    }

    public void settSyPsDelete(String tSyPsDelete) {
        this.tSyPsDelete = tSyPsDelete == null ? null : tSyPsDelete.trim();
    }

    public String gettSyPsRefundStatus() {
        return tSyPsRefundStatus;
    }

    public void settSyPsRefundStatus(String tSyPsRefundStatus) {
        this.tSyPsRefundStatus = tSyPsRefundStatus == null ? null : tSyPsRefundStatus.trim();
    }

    public BigDecimal gettSyPsRefundMoney() {
        return tSyPsRefundMoney;
    }

    public void settSyPsRefundMoney(BigDecimal tSyPsRefundMoney) {
        this.tSyPsRefundMoney = tSyPsRefundMoney;
    }

    public Date gettSyPsRefundDate() {
        return tSyPsRefundDate;
    }

    public void settSyPsRefundDate(Date tSyPsRefundDate) {
        this.tSyPsRefundDate = tSyPsRefundDate;
    }

    public String gettSyPsRefundOrderno() {
        return tSyPsRefundOrderno;
    }

    public void settSyPsRefundOrderno(String tSyPsRefundOrderno) {
        this.tSyPsRefundOrderno = tSyPsRefundOrderno == null ? null : tSyPsRefundOrderno.trim();
    }
}