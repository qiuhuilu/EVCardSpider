package com.ctrip.nb.common;

import com.google.common.base.Strings;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Created by qiuhl on 2017/5/12.
 */
public class GZipUtil {

    /**
     * gzip压缩
     * @param str
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String compress(String str) throws UnsupportedEncodingException {
        if(Strings.isNullOrEmpty(str)){
            return str;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gzip = new GZIPOutputStream(out);
            gzip.write(str.getBytes());
            gzip.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return out.toString("ISO-8859-1");
    }

    /**
     * 解压gzip
     * @param str
     * @return
     */
    public static String uncompress(String str){
        if(Strings.isNullOrEmpty(str)){
            return str;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            ByteArrayInputStream in = new ByteArrayInputStream(str.getBytes("ISO-8859-1"));
            GZIPInputStream gunzip = new GZIPInputStream(in);
            byte[] buffer = new byte[256];
            int n;
            while ((n=gunzip.read(buffer))>=0){
                out.write(buffer, 0, n);
            }

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return out.toString();
    }
}
