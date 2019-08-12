package com.hyt.entity;

import java.util.*;

/**
 * 二维码信息
 */
public class EwmInfo {

    private UserInfo userId;

    private String wxoppenId;

    private String baseStr;

    private String id;

    private int state;

    private String imgUrl;

    private Date updateTime;

    private String updateUser;

    private Date createTime;

    private String createUser;

    public UserInfo getUserId() {
        return userId;
    }

    public void setUserId(UserInfo userId) {
        this.userId = userId;
    }

    public String getWxoppenId() {
        return wxoppenId;
    }

    public void setWxoppenId(String wxoppenId) {
        this.wxoppenId = wxoppenId;
    }

    public String getBaseStr() {
        return baseStr;
    }

    public void setBaseStr(String baseStr) {
        this.baseStr = baseStr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

}