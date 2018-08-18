package com.bjut.net.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 未封装端口
 */
public class InetDemo01 {
    public static void main(String args[]) throws UnknownHostException {
        //通过本机获取InetAddress对象
        InetAddress inetAddress = InetAddress.getLocalHost();
        //获取本机IP
        System.out.println(inetAddress.getHostAddress());
        //获取本机名
        System.out.println(inetAddress.getHostName());

        System.out.println("===============");

        inetAddress = InetAddress.getByName("www.bilibili.com");
        System.out.println("B站IP="+inetAddress.getHostAddress());
        System.out.println("B站域名="+inetAddress.getHostName());

        System.out.println("===============");

        //以ip创建inetAddress对象，若ip不存在，则getHostName()返回ip
        inetAddress = InetAddress.getByName("52.74.223.119");   //github的IP地址
        System.out.println(inetAddress.getHostAddress());
        System.out.println(inetAddress.getHostName());
    }
}
