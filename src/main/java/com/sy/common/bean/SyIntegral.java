package com.sy.common.bean;

import java.util.Date;

public class SyIntegral {
    private Integer tSyIntegralId;

    private String tSyUserId;

    private String tSyIntegaralType;

    private Integer tSyIntegaralNumber;

    private Date tSyCreatedate;

    private String tSyBz1;

    private String tSyBz2;

    public Integer gettSyIntegralId() {
        return tSyIntegralId;
    }

    public void settSyIntegralId(Integer tSyIntegralId) {
        this.tSyIntegralId = tSyIntegralId;
    }

    public String gettSyUserId() {
        return tSyUserId;
    }

    public void settSyUserId(String tSyUserId) {
        this.tSyUserId = tSyUserId == null ? null : tSyUserId.trim();
    }

    public String gettSyIntegaralType() {
        return tSyIntegaralType;
    }

    public void settSyIntegaralType(String tSyIntegaralType) {
        this.tSyIntegaralType = tSyIntegaralType == null ? null : tSyIntegaralType.trim();
    }

    public Integer gettSyIntegaralNumber() {
        return tSyIntegaralNumber;
    }

    public void settSyIntegaralNumber(Integer tSyIntegaralNumber) {
        this.tSyIntegaralNumber = tSyIntegaralNumber;
    }

    public Date gettSyCreatedate() {
        return tSyCreatedate;
    }

    public void settSyCreatedate(Date tSyCreatedate) {
        this.tSyCreatedate = tSyCreatedate;
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
}