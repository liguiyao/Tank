package com.lgy.demo10;

public class test1 {
    public static void main(String[] args) {
        Car car = new Car(50);
        car.new Air().flow();
        Car car1 = new Car(20);
        car1.new Air().flow();
        Car car2 = new Car(-5);
        car2.new Air().flow();
    }
}

class Car{
    private int temperature;
    class Air{
        public void flow(){
            if (temperature > 40) {
                System.out.println("cold wind");
            } else if (temperature < 0) {
                System.out.println("warm wind");
            } else {
                System.out.println("close air-condition");
            }
        }

    }

    public Car(int temperature) {
        this.temperature = temperature;
    }
}
