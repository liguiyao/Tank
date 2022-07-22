package com.lgy.demo28;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTcp01Client {
    public static void main(String[] args) throws IOException {

        //连接本机的9999
        Socket socket1 = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println(socket1.getClass());

        OutputStream outputStream = socket1.getOutputStream();
        outputStream.write("hello server".getBytes());
        outputStream.close();
        socket1.close();
        System.out.println("客户端退出");


    }
}
