package com.ctrip.nb.service;

import com.ctrip.nb.common.GZipUtil;
import com.ctrip.nb.common.HttpUtil;
import com.ctrip.nb.pojo.EVShopRequestType;

/**
 * Created by qiuhl on 2017/5/12.
 */
public class ShopInfoService {
    public String getShopInfo(){
        String url = "https://mas.evcard.vip:8443/evcard-mas/getShopRealInfoGzip";
        String reqbody = "{\"vehicleModelSeq\":\"\"}";
        String response = HttpUtil.doPost(url,reqbody);
        return GZipUtil.uncompress(response);
    }

    public String getShopBaseInfo(EVShopRequestType request){
        String url = "https://mas.evcard.vip:8443/evcard-mas/getShopBaseInfoGzip";
        String reqbody = null;
        if(null != request){
            reqbody = request.toString();
        }
        String response = HttpUtil.doPost(url, reqbody);
        return GZipUtil.uncompress(response);
    }
}
