package com.ctrip.nb.test;

import com.ctrip.nb.pojo.EVShopRequestType;
import com.ctrip.nb.service.EVShopManagementService;
import com.ctrip.nb.service.ShopInfoService;

import org.junit.Test;

/**
 * Created by qiuhl on 2017/5/12.
 */
public class ShopInfoServiceTest {
    @Test
    public void testShopInfo(){
        ShopInfoService shopInfoService = new ShopInfoService();
        EVShopRequestType evShopRequestType = new EVShopRequestType();
        evShopRequestType.setToken("c368fa9e-751b-405c-8799-76b80c91bcdf");
        EVShopManagementService service = new EVShopManagementService();

        //shopInfoService.getShopBaseInfo(evShopRequestType);
        //service.insertEVShop(evShopRequestType);
        service.selectShopByCity("000T");
    }
}
