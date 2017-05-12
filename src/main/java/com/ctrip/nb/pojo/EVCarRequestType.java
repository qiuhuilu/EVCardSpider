package com.ctrip.nb.pojo;

/**
 * Created by qiuhl on 2017/5/8.
 */
public class EVCarRequestType {
    private int serialNum;
    private String token;
    private int approvedSeats;
    private String areaCode;
    private int canRent;
    private int drivingRange;
    private int serviceStatus;
    private String shopName;
    private int shopSeq;
    private int soc;
    private String vehicleModelName;
    private String vehicleModelSeq;
    private String vehicleNo;
    private String vin;

    public EVCarRequestType() {
        this.serialNum=0;
        this.approvedSeats=-1;
        this.canRent=1;
        this.drivingRange=0;
        this.serviceStatus=-1;
        this.soc=-1;
        this.shopSeq=0;
        this.vehicleModelSeq="";
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getApprovedSeats() {
        return approvedSeats;
    }

    public void setApprovedSeats(int approvedSeats) {
        this.approvedSeats = approvedSeats;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public int getCanRent() {
        return canRent;
    }

    public void setCanRent(int canRent) {
        this.canRent = canRent;
    }

    public int getDrivingRange() {
        return drivingRange;
    }

    public void setDrivingRange(int drivingRange) {
        this.drivingRange = drivingRange;
    }

    public int getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(int serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getShopSeq() {
        return shopSeq;
    }

    public void setShopSeq(int shopSeq) {
        this.shopSeq = shopSeq;
    }

    public int getSoc() {
        return soc;
    }

    public void setSoc(int soc) {
        this.soc = soc;
    }

    public String getVehicleModelName() {
        return vehicleModelName;
    }

    public void setVehicleModelName(String vehicleModelName) {
        this.vehicleModelName = vehicleModelName;
    }

    public String getVehicleModelSeq() {
        return vehicleModelSeq;
    }

    public void setVehicleModelSeq(String vehicleModelSeq) {
        this.vehicleModelSeq = vehicleModelSeq;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
}
