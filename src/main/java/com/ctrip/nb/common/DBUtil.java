package com.ctrip.nb.common;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by qiuhl on 2017/5/12.
 */
public class DBUtil {
    public static SqlSessionFactory sessionFactory;

    static {
        try {
            //使用MyBatis提供的Resources类加载mybatis的配置文件
            Reader reader = Resources.getResourceAsReader("mybatis.cfg.xml");
            //构建SQLSession的工厂
            sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //创建能执行映射文件的sql的sqlSession
    public static SqlSession getSession(){
        return sessionFactory.openSession();
    }
}
