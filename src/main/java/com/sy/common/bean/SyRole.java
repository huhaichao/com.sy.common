package com.sy.common.bean;

import java.util.Date;

public class SyRole {
	/**
	 * t_sy_role实体类
	 */
    private String tSyRoleId;//id

    private String tSyRoleName;//角色名称

    private Date tSyRoleCreatedate;//创建日期

    private String tSyRoleDescription;//状态

    private String tSyBz1;//备注1

    private String tSyBz2;//备注2

    public String gettSyRoleId() {
        return tSyRoleId;
    }

    public void settSyRoleId(String tSyRoleId) {
        this.tSyRoleId = tSyRoleId == null ? null : tSyRoleId.trim();
    }

    public String gettSyRoleName() {
        return tSyRoleName;
    }

    public void settSyRoleName(String tSyRoleName) {
        this.tSyRoleName = tSyRoleName == null ? null : tSyRoleName.trim();
    }

    public Date gettSyRoleCreatedate() {
        return tSyRoleCreatedate;
    }

    public void settSyRoleCreatedate(Date tSyRoleCreatedate) {
        this.tSyRoleCreatedate = tSyRoleCreatedate;
    }

    public String gettSyRoleDescription() {
        return tSyRoleDescription;
    }

    public void settSyRoleDescription(String tSyRoleDescription) {
        this.tSyRoleDescription = tSyRoleDescription == null ? null : tSyRoleDescription.trim();
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