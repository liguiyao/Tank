package com.lgy.demo3;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        AI tiger = new AI() {
            @Override
            public void cry() {
                System.out.println("Anonymous Inner Class");
            }
        };
        System.out.println("内部类:"+tiger.getClass());
        //相当于
//        class xxx implements AI{
//            ...
//        }

        Father father = new Father("1111"){

        };
        System.out.println("内部类2:"+father.getClass());
    }
}
class Father{
    public Father(String s) {

    }
    public void test(){}
}
interface AI{
    void cry();
}
