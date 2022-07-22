package com.lgy.demo29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
@SuppressWarnings({"all"})
public class ReflectionQuestion {
    public static void main(String[] args) throws Exception {
        //通过properties获取信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\dog.properties"));
        String classFullPath = properties.get("classFullPath").toString();
        String method = properties.get("method").toString();
        System.out.println(classFullPath+"---"+method);
        //反射 返回Class类型的对象
        Class cls = Class.forName(classFullPath);
        //获取对象
        Object o = cls.newInstance();
        System.out.println("拿到的类型"+o.getClass());
        //获取对象方法
        Method findMethod = cls.getMethod(method);
        //通过方法对象实现调用方法
        findMethod.invoke(o);

        //getField不能得到私有的属性
        Field age = cls.getField("age");
        System.out.println(age.get(o));

        Constructor constructor = cls.getConstructor();
        System.out.println(constructor);

        Constructor constructor1 = cls.getConstructor(String.class);
        System.out.println(constructor1);

    }
}
