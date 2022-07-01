package com.lgy.demo4;

public class Car {
    double price = 10;
    static String color = "white";

    public String toString(){
        return price+"\t"+color;
    }

    public Car() {
        this.price = 9;
        this.color = "red";
    }

    public Car(double price) {
        this.price = price;
    }
}
class test{
    public static void main(String[] args) {
        Car car = new Car();// 9 red
        Car car1 = new Car(100);//100 red
        System.out.println(car);
        System.out.println(car1);

    }
}
