 /***********************************************************************
 * Module:  EnterpriseInfo.java
 * Author:  xdd
 * Purpose: Defines the Class EnterpriseInfo
 ***********************************************************************/
package com.hyt.entity;
import java.util.*;

/**
 * 企业信息(1.联系人多人时？2.企业具体信息可以后续扩展）
 *
 * @pdOid 2daf03b5-0f30-4ab7-9694-c9b188dfeace
 */
public class EnterpriseInfo {
    /**
     * @pdOid 39639f19-aae4-4ff9-af13-ca95fb0ba238
     */
    private String id;
    /**
     * @pdOid 8a5698c8-816e-488a-9a3e-8581c7fd129c
     */
    private String name;
    /**
     * @pdOid 43240827-65db-410c-af53-31754f67d4ce
     */
    private Area areaId;
    /**
     * @pdOid 0dd05726-662c-458b-b127-5a102c1539b9
     */
    private String address;
    /**
     * @pdOid abbbcf53-a214-41ae-a506-c7ccbf9fc084
     */
    private String nsrsbh;
    /**
     * @pdOid 659bcb15-1d0b-4edb-843c-6298183bb877
     */
    private int isBw;
    /**
     * @pdOid 40971eaa-f3c4-48b5-bfbc-91796a84820d
     */
    private String lxr;
    /**
     * @pdOid bd030ca5-6adb-4e5d-914c-b7d625e84f85
     */
    private String lxdh;
    /**
     * @pdOid 2f52b48a-18ab-4ec8-9ade-03f5c6287216
     */
    private String jyfw;
    /**
     * @pdOid d7e3ea13-a016-42b9-b18b-b7a61d5f42bf
     */
    private Date createTime;
    /**
     * @pdOid 8f3f0109-ecce-4ae5-92c9-9573500882f6
     */
    private String createUser;
    /**
     * @pdOid 15bc0eb2-e0d6-49ec-b268-258ff0931065
     */
    private Date updateTime;
    /**
     * @pdOid a1d1c632-6d28-4136-9bd2-4af4674752ad
     */
    private String updateUserId;
    /**
     * @pdOid 9610d5a0-14ea-4b77-90c7-6d9a1a22263d
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

    public Area getAreaId() {
        return areaId;
    }

    public void setAreaId(Area areaId) {
        this.areaId = areaId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    public int getIsBw() {
        return isBw;
    }

    public void setIsBw(int isBw) {
        this.isBw = isBw;
    }

    public String getLxr() {
        return lxr;
    }

    public void setLxr(String lxr) {
        this.lxr = lxr;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    public String getJyfw() {
        return jyfw;
    }

    public void setJyfw(String jyfw) {
        this.jyfw = jyfw;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
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

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}