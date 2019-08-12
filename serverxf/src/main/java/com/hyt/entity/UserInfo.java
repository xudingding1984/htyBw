package com.hyt.entity;

import com.hyt.util.BaseVo;

import java.util.Date;

/**
 * 用户信息
 */
public class UserInfo extends BaseVo {

    private String id;

    private String pId;

    private String username;

    private String password;

    private String areaId;

    private String ewmId;

    private String wxId;

    private String enterpriseId;

    private int state;

    private int fxNum;

    private String createUser;

    private Date createTime;

    private Date updateTime;

    private String updateUser;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    public String getEwmId() {
        return ewmId;
    }

    public void setEwmId(String ewmId) {
        this.ewmId = ewmId;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getFxNum() {
        return fxNum;
    }

    public void setFxNum(int fxNum) {
        this.fxNum = fxNum;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
}
