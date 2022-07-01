package com.lgy.demo6;

import com.lgy.demo4.Car;

public abstract class Animal {
    abstract void shout();
}

class Cat extends Animal {

    @Override
    void shout() {
        System.out.println("cat tttttt");
    }
}

class Dog extends Animal {

    @Override
    void shout() {
        System.out.println("dogggggggg");
    }
}

class test{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.shout();
        Cat cat = new Cat();
        cat.shout();
    }
}
