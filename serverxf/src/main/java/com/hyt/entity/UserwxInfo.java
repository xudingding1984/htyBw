package com.hyt.entity; /***********************************************************************
 * Module:  UserwxInfo.java
 * Author:  xdd
 * Purpose: Defines the Class UserwxInfo
 ***********************************************************************/

import java.util.*;

/**
 * 用户微信信息
 *
 * @pdOid b2b617d0-14b3-43d4-97da-06d93a66112a
 */
public class UserwxInfo {
    /**
     * @pdOid f81eae69-4437-458e-a59b-cdd38cad8624
     */
    private int subscribe;
    /**
     * @pdOid f8975fd5-66ec-4c70-979b-99df1419e426
     */
    private String openid;
    /**
     * @pdOid 1dadb7a5-7045-45c3-af25-d730a5102881
     */
    private String nickname;
    /**
     * @pdOid 21662716-8b08-46e6-ae10-783a44496194
     */
    private String sex;
    /**
     * @pdOid e0705f1c-99e1-402c-bc39-6cdcc1d73a8b
     */
    private String city;
    /**
     * @pdOid 4d094f74-4e27-4b35-8757-d37de1e83334
     */
    private String country;
    /**
     * @pdOid 67cde1d3-06d1-4712-894b-cc2e3f60f703
     */
    private String province;
    /**
     * @pdOid 830ecb87-833b-4a24-946e-e62bd0dcdc81
     */
    private String language;
    /**
     * @pdOid 742b8a8b-cd4e-4f75-afcd-48d96a735ac8
     */
    private String headimgurl;
    /**
     * @pdOid d3b7c101-adab-4144-92b4-65077e63dfa0
     */
    private String subscribeTime;
    /**
     * @pdOid 3f0f3c4c-853a-49cb-893b-a86b62f61809
     */
    private String unionid;
    /**
     * @pdOid b32db8a0-883f-4ded-a022-f9de3cc98a1c
     */
    private String remark;
    /**
     * @pdOid 83cf7212-a360-4976-9912-d08dcbc46fc1
     */
    private String groupid;
    /**
     * @pdOid eaa32f3a-5358-42ff-a103-411320bc563e
     */
    private String tagidList;
    /**
     * @pdOid 2252d345-dade-4a1f-94a7-8a06abffd637
     */
    private String subscribeScene;
    /**
     * @pdOid 2d6b353c-3e70-4308-a200-afbdf5dd18db
     */
    private String qrScene;
    /**
     * @pdOid 7cf9f5d4-c429-45b2-a330-06e54701f5b7
     */
    private String qrSceneStr;
    /**
     * @pdOid 3ceb654f-9d3d-4f24-80ae-cd8f6444c9c4
     */
    private UserInfo userId;
    /**
     * @pdOid 97e33124-a533-4b6a-8409-14cfa3d06a15
     */
    private Date createTime;
    /**
     * @pdOid cc0208b8-aee1-478a-ae7d-044661348ee7
     */
    private String createUserId;
    /**
     * @pdOid 6395b09a-35ee-4ca7-94ed-6e8758610cac
     */
    private int state;
    /**
     * @pdOid c8852eac-b8ba-4bec-bea5-9c31a6966885
     */
    private EwmInfo ewmId;
    /**
     * @pdOid c3eb8ca2-e93b-410b-a53a-a930b8832a5e
     */
    private String id;
    /**
     * @pdOid 2b29fc4e-8e98-4baf-9e9e-da75644990d1
     */
    private Date updateTime;
    /**
     * @pdOid 9211042f-06dc-4161-ba6e-0e7c6d16670a
     */
    private String updateUserId;
    /**
     * @pdOid d9577406-f998-47ae-becf-a954919dc603
     */
    private Area areaId;


    public int getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(int subscribe) {
        this.subscribe = subscribe;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public String getSubscribeTime() {
        return subscribeTime;
    }

    public void setSubscribeTime(String subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getTagidList() {
        return tagidList;
    }

    public void setTagidList(String tagidList) {
        this.tagidList = tagidList;
    }

    public String getSubscribeScene() {
        return subscribeScene;
    }

    public void setSubscribeScene(String subscribeScene) {
        this.subscribeScene = subscribeScene;
    }

    public String getQrScene() {
        return qrScene;
    }

    public void setQrScene(String qrScene) {
        this.qrScene = qrScene;
    }

    public String getQrSceneStr() {
        return qrSceneStr;
    }

    public void setQrSceneStr(String qrSceneStr) {
        this.qrSceneStr = qrSceneStr;
    }

    public UserInfo getUserId() {
        return userId;
    }

    public void setUserId(UserInfo userId) {
        this.userId = userId;
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

    public EwmInfo getEwmId() {
        return ewmId;
    }

    public void setEwmId(EwmInfo ewmId) {
        this.ewmId = ewmId;
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

    public Area getAreaId() {
        return areaId;
    }

    public void setAreaId(Area areaId) {
        this.areaId = areaId;
    }
}