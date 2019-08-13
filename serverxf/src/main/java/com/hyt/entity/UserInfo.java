/***********************************************************************
 * Module:  UserInfo.java
 * Author:  xdd
 * Purpose: Defines the Class UserInfo
 ***********************************************************************/
package com.hyt.entity;

import com.hyt.util.BaseVo;

import java.util.Date;

/**
 * 用户信息
 *
 * @pdOid 37cd45ec-18c2-4bde-92b8-d9704f9748d1
 */
public class UserInfo extends BaseVo {
    /**
     * @pdOid a492210b-8f1d-419d-96e4-f02e2b4aef1f
     */
    private String id;
    /**
     * @pdOid d4195ed9-2a96-4ecf-9dcd-7c772479e4ef
     */
    private String pId;
    /**
     * @pdOid 4a6e8721-9e10-4687-9c7f-667900942f8c
     */
    private String username;
    /**
     * @pdOid 3e59164c-0ef7-44ff-8782-2fd47d2a9c50
     */
    private String password;
    /**
     * @pdOid ccba9123-6453-4802-9d77-a1536ed8959d
     */
    private String areaId;
    /**
     * @pdOid 857fa6cb-ed67-474d-8be6-40078ccedd13
     */
    private String ewmInfoId;
    /**
     * @pdOid 2ed09262-38e4-4787-b2a0-5f2a991f21b8
     */
    private String wxId;
    /**
     * @pdOid 25bc668c-3358-41ad-a76b-7e0bd7cdb1a4
     */
    private String enterpriseInfoId;
    /**
     * @pdOid 24998e8a-466b-4b4d-b347-646c338a55ed
     */
    private String createUserId;
    /**
     * @pdOid 316a4c54-e624-4834-bebb-346948bd9133
     */
    private Date createTime;
    /**
     * @pdOid 48aa2c4a-b0d8-4e9d-95ed-f6fff4960d85
     */
    private int state;
    /**
     * @pdOid 838577f8-6228-47db-99f1-f45901269c8b
     */
    private int fxNum;
    /**
     * @pdOid d6d40985-a664-4248-9f47-04efa1548ccb
     */
    private Date updateTime;
    /**
     * @pdOid 336a2cd8-83e6-46e9-bc5c-bf1e3e89008d
     */
    private String updateUserId;


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

    public String getEwmInfoId() {
        return ewmInfoId;
    }

    public void setEwmInfoId(String ewmInfoId) {
        this.ewmInfoId = ewmInfoId;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    public String getEnterpriseInfoId() {
        return enterpriseInfoId;
    }

    public void setEnterpriseInfoId(String enterpriseInfoId) {
        this.enterpriseInfoId = enterpriseInfoId;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }
}
