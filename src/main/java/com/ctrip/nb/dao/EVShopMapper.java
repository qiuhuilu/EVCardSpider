package com.ctrip.nb.dao;

import com.ctrip.nb.pojo.EVShop;

import java.util.List;

/**
 * Created by qiuhl on 2017/5/12.
 */
public interface EVShopMapper {
    public int insertEVShop(EVShop shop) throws Exception;
    public int updateEVShop(EVShop shop, int shopSeq) throws Exception;
    public int deleteEVshop(int shopSeq) throws Exception;
    public EVShop selectShopByShopSeq(int shopSeq) throws Exception;
    public List<EVShop> selectShopByCity(String orgId) throws Exception;
}
