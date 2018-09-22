package com.sy.common.bean;

public class SyUserrole {
    private String tSyUserroleId;

    private String tSyUserId;

    private String tSyRoleId;

    private String tSyBz1;

    private String tSyBz2;

    public String gettSyUserroleId() {
        return tSyUserroleId;
    }

    public void settSyUserroleId(String tSyUserroleId) {
        this.tSyUserroleId = tSyUserroleId == null ? null : tSyUserroleId.trim();
    }

    public String gettSyUserId() {
        return tSyUserId;
    }

    public void settSyUserId(String tSyUserId) {
        this.tSyUserId = tSyUserId == null ? null : tSyUserId.trim();
    }

    public String gettSyRoleId() {
        return tSyRoleId;
    }

    public void settSyRoleId(String tSyRoleId) {
        this.tSyRoleId = tSyRoleId == null ? null : tSyRoleId.trim();
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