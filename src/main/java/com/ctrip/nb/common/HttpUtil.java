package com.ctrip.nb.common;

import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.ResponseServer;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by qiuhl on 2017/5/12.
 */
public class HttpUtil {
    /**
     * post方法  json格式请求
     * @param url
     * @param json
     * @return
     */
    public static String doPost(String url, String json){
        String response = "这是默认的返回值，接口调用失败";
        //第一步：创建HttpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //第二步：创建httppost对象
        HttpPost post = new HttpPost(url);
        //第三步：给HttpPost对象设置json格式的参数
        StringEntity requestEntity = new StringEntity(json, "UTF-8");
        requestEntity.setContentEncoding("UTF-8");
        post.setHeader("Content-type", "application/json");
        post.setEntity(requestEntity);

        //第四步：发送HttpPost请求，获取返回值
        try {
            CloseableHttpResponse res = httpClient.execute(post);
            if(res.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
                response = EntityUtils.toString(res.getEntity());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //第五步：关闭连接
            closeHttpClient(httpClient);
        }
        return response;
    }

    /**
     * Get 方法
     * @param url
     * @param params
     * @return
     */
    public static String doGet(String url, Map<String, Object> params) {
        String response = "这是默认的返回值，接口调用失败";
        //第一步：创建httpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //第二步：设置参数
        if(null != params && !params.isEmpty()){
            List<NameValuePair> pairList = new ArrayList<NameValuePair>(params.size());
            for(String key: params.keySet()){
                pairList.add(new BasicNameValuePair(key, params.get(key).toString()));
            }
            try {
                url += "?" + EntityUtils.toString(new UrlEncodedFormEntity(pairList, "UTF-8"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //第三步：创建HttpGet对象
        HttpGet get = new HttpGet(url);
        CloseableHttpResponse res = null;
        try {
            res = httpClient.execute(get);
            if(res.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
                response = EntityUtils.toString(res.getEntity());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            closeHttpClient(httpClient);
        }

        return response;
    }

    //关闭连接
    public static void closeHttpClient(CloseableHttpClient client){
        if(null != client){
            try {
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
