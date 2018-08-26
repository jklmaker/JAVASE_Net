package com.bjut.net.udp;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
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
        System.out.println(convert(data, len));
        //释放资源
        server.close();
    }

    public static double convert(byte[] data,int len) {
        double d = -1;
        ByteArrayInputStream bis = new ByteArrayInputStream(data, 0, len);
        DataInputStream dis = new DataInputStream(bis);
        try {
            d = dis.readDouble();
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return d;
    }
}
