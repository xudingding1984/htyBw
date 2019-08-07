package com.hyt.entity; /***********************************************************************
 * Module:  Area.java
 * Author:  xdd
 * Purpose: Defines the Class Area
 ***********************************************************************/

import java.util.*;

/**
 * 区域信息
 *
 * @pdOid cf83dde5-3882-4592-9225-122b8c282ef4
 */
public class Area {
    /**
     * @pdOid f5f30618-def7-4454-ab0d-a42dc9a5ac6d
     */
    private String id;
    /**
     * @pdOid c342d2e1-5b8f-48db-a2e2-514d5a67076e
     */
    private String name;
    /**
     * @pdOid e718a596-b28e-4ec4-b177-f44277c66ef2
     */
    private String code;
    /**
     * @pdOid a0391cb7-aa06-4eca-8cfa-88366dfc9c98
     */
    private String jibie;
    /**
     * @pdOid 95a9d5bd-651b-4b68-8e72-44f623b05a55
     */
    private Date updateTime;
    /**
     * @pdOid d54ae93d-cccc-4b95-9c9d-45ceefd53b14
     */
    private String updateUserId;
    /**
     * @pdOid 02826250-09b9-4aa9-9400-12fa50141555
     */
    private Date createTime;
    /**
     * @pdOid 515fd6c2-6efd-4c7e-8c3a-cc9a81cea038
     */
    private String createUserId;
    /**
     * @pdOid b30e4276-58fb-433a-902b-df4f0bcb764f
     */
    private int state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getJibie() {
        return jibie;
    }

    public void setJibie(String jibie) {
        this.jibie = jibie;
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
}