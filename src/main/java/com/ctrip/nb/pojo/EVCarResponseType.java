package com.ctrip.nb.pojo;

import java.util.List;

/**
 * Created by qiuhl on 2017/5/8.
 */
public class EVCarResponseType {
    private int serialNum;
    private int status;
    private String message;
    private String serviceName;
    private List<EVCar> dataList;
    private int listSize;
    private int shopSeq;
    private int statckCnt;
    private int allowStackCnt;
    private int allowVehileCnt;
    private int canParkNum;
    private int parkCnt;

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public List<EVCar> getDataList() {
        return dataList;
    }

    public void setDataList(List<EVCar> dataList) {
        this.dataList = dataList;
    }

    public int getListSize() {
        return listSize;
    }

    public void setListSize(int listSize) {
        this.listSize = listSize;
    }

    public int getShopSeq() {
        return shopSeq;
    }

    public void setShopSeq(int shopSeq) {
        this.shopSeq = shopSeq;
    }

    public int getStatckCnt() {
        return statckCnt;
    }

    public void setStatckCnt(int statckCnt) {
        this.statckCnt = statckCnt;
    }

    public int getAllowStackCnt() {
        return allowStackCnt;
    }

    public void setAllowStackCnt(int allowStackCnt) {
        this.allowStackCnt = allowStackCnt;
    }

    public int getAllowVehileCnt() {
        return allowVehileCnt;
    }

    public void setAllowVehileCnt(int allowVehileCnt) {
        this.allowVehileCnt = allowVehileCnt;
    }

    public int getCanParkNum() {
        return canParkNum;
    }

    public void setCanParkNum(int canParkNum) {
        this.canParkNum = canParkNum;
    }

    public int getParkCnt() {
        return parkCnt;
    }

    public void setParkCnt(int parkCnt) {
        this.parkCnt = parkCnt;
    }
}
