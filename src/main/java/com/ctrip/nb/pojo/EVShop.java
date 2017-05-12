package com.ctrip.nb.pojo;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by qiuhl on 2017/5/12.
 */
public class EVShop {
    private int shopSeq;
    private String shopName;
    private String tel;
    private String address;
    private String areaCode;
    private int latitude;
    private int longitude;
    private String shopPicUrl;
    private int forPublic;
    private Date updatedTime;
    private String agencyId;
    private int restrict;
    private int deleteFlag;
    private int shopProperty;
    private float pickVehAmount;
    private float returnVehAmount;
    private String chargeStandards;
    private String navigateAddress;
    private int shopType;
    private String stackType;
    private String shopOpenTime;
    private String shopCloseTime;
    private String orgId;
    private String grade;

    public int getShopSeq() {
        return shopSeq;
    }

    public void setShopSeq(int shopSeq) {
        this.shopSeq = shopSeq;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public String getShopPicUrl() {
        return shopPicUrl;
    }

    public void setShopPicUrl(String shopPicUrl) {
        this.shopPicUrl = shopPicUrl;
    }

    public int getForPublic() {
        return forPublic;
    }

    public void setForPublic(int forPublic) {
        this.forPublic = forPublic;
    }

    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    public int getRestrict() {
        return restrict;
    }

    public void setRestrict(int restrict) {
        this.restrict = restrict;
    }

    public int getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(int deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public int getShopProperty() {
        return shopProperty;
    }

    public void setShopProperty(int shopProperty) {
        this.shopProperty = shopProperty;
    }

    public float getPickVehAmount() {
        return pickVehAmount;
    }

    public void setPickVehAmount(float pickVehAmount) {
        this.pickVehAmount = pickVehAmount;
    }

    public float getReturnVehAmount() {
        return returnVehAmount;
    }

    public void setReturnVehAmount(float returnVehAmount) {
        this.returnVehAmount = returnVehAmount;
    }

    public String getChargeStandards() {
        return chargeStandards;
    }

    public void setChargeStandards(String chargeStandards) {
        this.chargeStandards = chargeStandards;
    }

    public String getNavigateAddress() {
        return navigateAddress;
    }

    public void setNavigateAddress(String navigateAddress) {
        this.navigateAddress = navigateAddress;
    }

    public int getShopType() {
        return shopType;
    }

    public void setShopType(int shopType) {
        this.shopType = shopType;
    }

    public String getStackType() {
        return stackType;
    }

    public void setStackType(String stackType) {
        this.stackType = stackType;
    }

    public String getShopOpenTime() {
        return shopOpenTime;
    }

    public void setShopOpenTime(String shopOpenTime) {
        this.shopOpenTime = shopOpenTime;
    }

    public String getShopCloseTime() {
        return shopCloseTime;
    }

    public void setShopCloseTime(String shopCloseTime) {
        this.shopCloseTime = shopCloseTime;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
