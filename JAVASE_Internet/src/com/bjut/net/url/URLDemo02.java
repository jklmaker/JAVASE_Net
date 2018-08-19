package com.bjut.net.url;

import java.io.*;
import java.net.*;

/**
 * 获取资源
 */
public class URLDemo02 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.baidu.com");       //主页 默认资源

//        InputStream in = url.openStream();
//        byte[] buffer = new byte[1024];
//        String res = "";
//        while(in.read(buffer) > 0) {
//            res += new String(buffer);
//        }
//        System.out.println(res);

        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));
        String res = "";
        char[] buffer = new char[1024];
        int len;
        while((len = reader.read(buffer)) > 0) {
            res += new String(buffer, 0, len);
        }
        System.out.println(res);

        File file = new File("text.html");
        if(!file.exists())
            file.createNewFile();
        FileOutputStream outputStream = new FileOutputStream(file);
        outputStream.write(res.getBytes("utf-8"));

    }
}
