package com.bjut.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class MyServer {
    public static void main(String[] args) throws IOException {
        //1.创建服务器   端口
        DatagramSocket server = new DatagramSocket(8888);
        //2.创建容器
        byte[] container = new byte[1024];
        //3.封装成待接收的DatagramPacket数据包
        DatagramPacket packet = new DatagramPacket(container, container.length);
        //4.接收数据
        server.receive(packet);
        //5.处理数据
        byte[] data = packet.getData();
        int len = packet.getLength();
        System.out.println(new String(data, 0, len));
        //释放资源
        server.close();
    }
}
