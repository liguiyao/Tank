package com.lgy.demo29;

import java.lang.reflect.Field;

public class Class02 {
    public static void main(String[] args) throws Exception {
        String classAllPath = "com.lgy.demo29.Car";
        Class cls = Class.forName(classAllPath);
        System.out.println(cls);
        System.out.println(cls.getClass());

        System.out.println(cls.getPackage().getName());
        Car car =(Car) cls.newInstance();
        System.out.println(car);

        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));
        brand.set(car,"Benz");
        System.out.println(car);


    }
}
