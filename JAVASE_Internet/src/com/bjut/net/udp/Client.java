package com.bjut.net.udp;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args) throws IOException {
        //1.创建服务器     端口
        DatagramSocket client = new DatagramSocket(6666);
        //2.制作要发送的数据
        double msg = 98.12;
        byte[] data = convert(msg);
        //3.打包
        DatagramPacket packet = new DatagramPacket(data, 0, data.length, InetAddress.getByName("127.0.0.1"), 8888);
        //4.发送给服务器
        client.send(packet);
        //5.释放资源
        client.close();
    }

    public static byte[] convert(double num) {
        byte[] data = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(bos);
        try {
            dos.writeDouble(num);
            dos.flush();
            data = bos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
