package com.bjut.net.udp;

import java.io.IOException;
import java.net.*;

public class MyClient {
    public static void main(String[] args) throws IOException {
        //1.创建服务器     端口
        DatagramSocket client = new DatagramSocket(6666);
        //2.制作要发送的数据
        String msg = "hello,i am a client.";
        //3.打包
        DatagramPacket packet = new DatagramPacket(msg.getBytes(), 0, msg.length(), InetAddress.getByName("127.0.0.1"), 8888);
        //4.发送给服务器
        client.send(packet);
        //5.释放资源
        client.close();
    }
}
