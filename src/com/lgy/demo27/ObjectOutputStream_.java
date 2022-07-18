package com.lgy.demo27;

import java.io.*;

public class ObjectOutputStream_ {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\testDemo\\data.dat";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        oos.writeInt(100);
        oos.writeBoolean(true);
        oos.writeChar('a');
        oos.writeDouble(9.6);
        oos.writeUTF("教育");

        oos.writeObject(new Dog());
        oos.close();

    }
}
