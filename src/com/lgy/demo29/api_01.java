package com.lgy.demo29;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class api_01 {
    public static void main(String[] args) throws Exception {
//        System.out.println(cls.getName());
//        System.out.println(cls.getSimpleName());
//        Field[] fields = cls.getFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }
        //无参构造方法
        Class cls = Class.forName("com.lgy.demo29.Car");
        Constructor constructor = cls.getConstructor();
        System.out.println(constructor);
        Object o = constructor.newInstance();
        System.out.println(o);
        //有参构造方法
        Constructor constructor1 = cls.getConstructor(String.class, int.class);
        Object o1 = constructor1.newInstance("hahaha", 12);
        System.out.println(o1);


    }
}
