package com.lgy.demo27;

import java.io.*;
import java.util.Properties;

public class Homework03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         * 编写一个dog.properties name = tom，age = 5，color = red
         * 编写dog类，创建一个dog对象，读取配置文件，完成初始化，并输出
         * 将创建的Dog序列化写入文件
         */
        String filePath = "src\\dog.properties";
        Properties properties = new Properties();
        properties.load(new FileReader(filePath));
        properties.list(System.out);

        String name = properties.getProperty("name");
        int age = Integer.parseInt(properties.getProperty("age"));
        String color = properties.get("color")+"";

        Dog dog = new Dog(name, age);
        System.out.println(dog);

        String serFilePath = "d:\\testDemo\\dog.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serFilePath));
        oos.writeObject(dog);
        oos.close();


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serFilePath));
        Dog dd = (Dog) ois.readObject();

        System.out.println(dd);

    }
}

