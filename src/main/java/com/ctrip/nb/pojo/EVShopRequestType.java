package com.ctrip.nb.pojo;

/**
 * Created by qiuhl on 2017/5/12.
 */
public class EVShopRequestType {
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "{" +
                "\"token\":\"" + token + "\"" +
                '}';
    }
}
