package com.sy.common.busibean;

import java.util.Date;

public class SyMessage {
    private Integer tSyMessageId;

    private Integer tSyUserId;

    private String tSyThingsName;

    private String tSyThingsType;

    private String tSyMessageType;

    private String tSyPassword;

    private Integer tSyMessageState;

    private Integer tSySendType;

    private Date tSyDate;

    private String tSyBz1;

    private String tSyBz2;

    private Date tSyEnddate;

    private Date tSyExpirationDate;

    private String tSyStatus;

    private String tSyDelStatus;

    private Date tSyDelDate;

    private String tSyCheck;

    public Integer gettSyMessageId() {
        return tSyMessageId;
    }

    public void settSyMessageId(Integer tSyMessageId) {
        this.tSyMessageId = tSyMessageId;
    }

    public Integer gettSyUserId() {
        return tSyUserId;
    }

    public void settSyUserId(Integer tSyUserId) {
        this.tSyUserId = tSyUserId;
    }

    public String gettSyThingsName() {
        return tSyThingsName;
    }

    public void settSyThingsName(String tSyThingsName) {
        this.tSyThingsName = tSyThingsName == null ? null : tSyThingsName.trim();
    }

    public String gettSyThingsType() {
        return tSyThingsType;
    }

    public void settSyThingsType(String tSyThingsType) {
        this.tSyThingsType = tSyThingsType == null ? null : tSyThingsType.trim();
    }

    public String gettSyMessageType() {
        return tSyMessageType;
    }

    public void settSyMessageType(String tSyMessageType) {
        this.tSyMessageType = tSyMessageType == null ? null : tSyMessageType.trim();
    }

    public String gettSyPassword() {
        return tSyPassword;
    }

    public void settSyPassword(String tSyPassword) {
        this.tSyPassword = tSyPassword == null ? null : tSyPassword.trim();
    }

    public Integer gettSyMessageState() {
        return tSyMessageState;
    }

    public void settSyMessageState(Integer tSyMessageState) {
        this.tSyMessageState = tSyMessageState;
    }

    public Integer gettSySendType() {
        return tSySendType;
    }

    public void settSySendType(Integer tSySendType) {
        this.tSySendType = tSySendType;
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

    public Date gettSyEnddate() {
        return tSyEnddate;
    }

    public void settSyEnddate(Date tSyEnddate) {
        this.tSyEnddate = tSyEnddate;
    }

    public Date gettSyExpirationDate() {
        return tSyExpirationDate;
    }

    public void settSyExpirationDate(Date tSyExpirationDate) {
        this.tSyExpirationDate = tSyExpirationDate;
    }

    public String gettSyStatus() {
        return tSyStatus;
    }

    public void settSyStatus(String tSyStatus) {
        this.tSyStatus = tSyStatus == null ? null : tSyStatus.trim();
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

    public String gettSyCheck() {
        return tSyCheck;
    }

    public void settSyCheck(String tSyCheck) {
        this.tSyCheck = tSyCheck == null ? null : tSyCheck.trim();
    }
}