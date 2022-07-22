package com.lgy.demo28;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTcp01Server {
    public static void main(String[] args) throws IOException {
        //在本机9999端口监听，等待连接，前提是当前这个端口未被占用
        ServerSocket serverSocket = new ServerSocket(9999);
        //程序会阻塞,等待连接
        //如果客户端连接则返回socket对象，程序继续
        Socket socket = serverSocket.accept();
        System.out.println(socket.getClass());


        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));
        }

        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
