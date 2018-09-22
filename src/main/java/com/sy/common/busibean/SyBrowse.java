package com.sy.common.busibean;

import java.util.Date;

public class SyBrowse {
    private Integer tSyBrowseId;

    private String tSyMessageId;

    private String tSyUserId;

    //private String tSyThingsName;

    //private Integer tSyThingsType;

    private Date tSyDate;

    private String tSyBz1;

    private String tSyBz2;

    public Integer gettSyBrowseId() {
        return tSyBrowseId;
    }

    public void settSyBrowseId(Integer tSyBrowseId) {
        this.tSyBrowseId = tSyBrowseId;
    }

    public String gettSyMessageId() {
        return tSyMessageId;
    }

    public void settSyMessageId(String tSyMessageId) {
        this.tSyMessageId = tSyMessageId == null ? null : tSyMessageId.trim();
    }

    public String gettSyUserId() {
        return tSyUserId;
    }

    public void settSyUserId(String tSyUserId) {
        this.tSyUserId = tSyUserId == null ? null : tSyUserId.trim();
    }

    /*public String gettSyThingsName() {
        return tSyThingsName;
    }

    public void settSyThingsName(String tSyThingsName) {
        this.tSyThingsName = tSyThingsName == null ? null : tSyThingsName.trim();
    }

    public Integer gettSyThingsType() {
        return tSyThingsType;
    }

    public void settSyThingsType(Integer tSyThingsType) {
        this.tSyThingsType = tSyThingsType;
    }*/

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
}