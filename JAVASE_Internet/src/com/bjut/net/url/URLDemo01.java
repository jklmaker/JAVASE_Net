package com.bjut.net.url;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo01 {
    public static void main(String[] args) throws MalformedURLException {
        //绝对路径构建
        URL url = new URL("http://www.baidu.com:80/index.html#aa?username=zs");
     //     URL url = new URL("http://www.baidu.com:80/index.html?username=zs");
//        url = new URL("http://www.bilibili.com:80/aaa/");
//        url = new URL(url, "/b.txt");       //相对路径构建
//        System.out.println(url.toString());
        System.out.println("协议:"+url.getProtocol());
        System.out.println("域名:"+url.getHost());
        System.out.println("端口:"+url.getPort());
        System.out.println("资源:"+url.getFile());
        System.out.println("相对路径:"+url.getPath());
        System.out.println("锚点:"+url.getRef());
        System.out.println("参数:"+url.getQuery());       //若存在锚点,则返回null
    }
}
