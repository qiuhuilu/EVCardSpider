package com.ctrip.nb.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.ctrip.nb.common.DBUtil;
import com.ctrip.nb.dao.EVShopMapper;
import com.ctrip.nb.pojo.EVShop;
import com.ctrip.nb.pojo.EVShopRequestType;
import com.ctrip.nb.pojo.EVShopResponseType;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by qiuhl on 2017/5/12.
 */
public class EVShopManagementService {
    ShopInfoService service = new ShopInfoService();

    /**
     * 调用getShopBaseInfoGzip接口拿到EVCard的所有网点
     * @param request  EVCard接口的payload，主要是提供token
     */
    public void insertEVShop(EVShopRequestType request){
        //获取mybatis的session对象
        SqlSession session = DBUtil.getSession();
        //创建mapper对象
        EVShopMapper mapper = session.getMapper(EVShopMapper.class);
        //调用getShopBaseInfoGzip接口（有ShopInfoService封装调用） 获取返回值
        EVShopResponseType evShopResponse = JSON.parseObject(service.getShopBaseInfo(request),new TypeReference<EVShopResponseType>(){});
        //获取到EVCard网点的list对象
        List<EVShop> evShopList = evShopResponse.getDataList();
        //将网点数据存入数据库
        for (EVShop shop : evShopList){
            try {
                //插入数据
                mapper.insertEVShop(shop);
                session.commit();
            } catch (Exception e) {
                e.printStackTrace();
                session.rollback();
            }
        }
    }

    /**
     * 根据CITY的orgID查询城市中的所有网点
     * @param orgId
     * @return
     */
    public List<EVShop> selectShopByCity(String orgId){
        SqlSession session = DBUtil.getSession();
        EVShopMapper mapper = session.getMapper(EVShopMapper.class);
        List<EVShop> shops = null;
        try {
            shops = mapper.selectShopByCity(orgId);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
        return shops;
    }
}
