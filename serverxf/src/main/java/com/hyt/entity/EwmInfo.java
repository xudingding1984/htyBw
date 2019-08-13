package com.hyt.entity; /***********************************************************************
 * Module:  EwmInfo.java
 * Author:  xdd
 * Purpose: Defines the Class EwmInfo
 ***********************************************************************/

import java.util.*;

/**
 * 二维码信息
 *
 * @pdOid 13c312f6-86d2-4544-8bf7-11d14180eca2
 */
public class EwmInfo {
    /**
     * @pdOid 087ba8df-ab91-4568-bd2e-f28992ac4a8f
     */
    private UserInfo userId;
    /**
     * @pdOid 812442b8-5d03-44e2-bac9-3df545273e08
     */
    private String wxoppenId;
    /**
     * @pdOid ce81ccc5-fa58-439d-bd63-d84e6b25e817
     */
    private String baseStr;
    /**
     * @pdOid 50ef6bd1-c92e-470d-be64-6f1de2e0829d
     */
    private String id;
    /**
     * @pdOid 60cd86e7-1ae7-4ee1-b82a-28b1c469734f
     */
    private Date updateTime;
    /**
     * @pdOid 1bf20fef-e3e6-467e-82fe-beb844d6020f
     */
    private String updateUserId;
    /**
     * @pdOid da23d54a-762c-4704-ae95-48df9dfdd8fa
     */
    private Date createTime;
    /**
     * @pdOid 4de233c3-85e2-46ad-bb70-79c82a4f2057
     */
    private String createUserId;
    /**
     * @pdOid c849d8d4-2bcb-479d-b3dc-056fc06c5640
     */
    private int state;
    /**
     * @pdOid 5f9eb15e-2c47-45ef-ad88-6f81864190c8
     */
    private String imgurl;

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

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }
}