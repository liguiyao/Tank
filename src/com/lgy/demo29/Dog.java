package com.lgy.demo29;

public class Dog {
    private String name = "tom";
    public int age =  10;
    public void hi(){
        System.out.println("hi this is " + name);
    }

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }
}
