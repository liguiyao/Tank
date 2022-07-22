package com.lgy.demo28;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Api_ {
    public static void main(String[] args) throws UnknownHostException {
        //获取本机
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        //根据域名获取
        InetAddress host = InetAddress.getByName("www.baidu.com");
        System.out.println(host);

        String hostName = host.getHostName();
        System.out.println(hostName);

    }
}
