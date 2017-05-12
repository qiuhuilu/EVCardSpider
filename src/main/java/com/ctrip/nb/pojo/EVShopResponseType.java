package com.ctrip.nb.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qiuhl on 2017/5/12.
 */
public class EVShopResponseType {
    private int serialNum;
    private int status;
    private String message;
    private String serviceName;
    private String token;
    private List<EVShop> dataList;
    private int listSize;

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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<EVShop> getDataList() {
        return dataList;
    }

    public void setDataList(List<EVShop> dataList) {
        this.dataList = dataList;
    }

    public int getListSize() {
        return listSize;
    }

    public void setListSize(int listSize) {
        this.listSize = listSize;
    }
}
