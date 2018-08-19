package com.bjut.net.ip;

import java.net.InetSocketAddress;

/**
 * 封装端口
 */
public class InetSocketDemo01 {
    public static void main(String[] args) {
        InetSocketAddress inetSocketAddress = new InetSocketAddress("www.baidu.com", 80);
        System.out.println(inetSocketAddress.getAddress());
        System.out.println(inetSocketAddress.getHostName());
        System.out.println(inetSocketAddress.getPort());        //80
    }
}
