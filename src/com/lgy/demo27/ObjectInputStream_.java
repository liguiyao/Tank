package com.lgy.demo27;

import java.io.*;

public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filePath = "d:\\testDemo\\data.dat";

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
        //反序列化顺序要和序列化顺序一致
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());

        Object o = ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
