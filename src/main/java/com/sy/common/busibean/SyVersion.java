package com.sy.common.busibean;

import java.util.Date;

public class SyVersion {
    private Integer tSyVersionId;

    private String tSyVersionNumber;

    private String tSyCreateuser;

    private Date tSyCreatedate;

    private String tSyCreateinfo;

    private String tSyBz1;

    private String tSyBz2;

    public Integer gettSyVersionId() {
        return tSyVersionId;
    }

    public void settSyVersionId(Integer tSyVersionId) {
        this.tSyVersionId = tSyVersionId;
    }

    public String gettSyVersionNumber() {
        return tSyVersionNumber;
    }

    public void settSyVersionNumber(String tSyVersionNumber) {
        this.tSyVersionNumber = tSyVersionNumber == null ? null : tSyVersionNumber.trim();
    }

    public String gettSyCreateuser() {
        return tSyCreateuser;
    }

    public void settSyCreateuser(String tSyCreateuser) {
        this.tSyCreateuser = tSyCreateuser == null ? null : tSyCreateuser.trim();
    }

    public Date gettSyCreatedate() {
        return tSyCreatedate;
    }

    public void settSyCreatedate(Date tSyCreatedate) {
        this.tSyCreatedate = tSyCreatedate;
    }

    public String gettSyCreateinfo() {
        return tSyCreateinfo;
    }

    public void settSyCreateinfo(String tSyCreateinfo) {
        this.tSyCreateinfo = tSyCreateinfo == null ? null : tSyCreateinfo.trim();
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