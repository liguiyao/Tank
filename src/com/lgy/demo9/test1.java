package com.lgy.demo9;

public class test1 {
    public static void main(String[] args) {
        Person tom = new Person("tom",VehiclesFactory.getHorse());
        tom.getV().work();
    }
}

interface Vehicles{
    void work();
}

class Horse implements Vehicles {

    @Override
    public void work() {
        System.out.println("牛马...");
    }
}

class Boat implements Vehicles {

    @Override
    public void work() {
        System.out.println("小船...");
    }
}

class VehiclesFactory{
    private static Horse horse = new Horse();
    private static Boat boat = new Boat();

    public static Horse getHorse(){
        return horse;
    }
    public static Boat getBoat(){
        return boat;
    }
}
class Person{
    private String name;
    private Vehicles v;

    public Person(String name,Vehicles v) {
        this.name = name;
        this.v = v;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicles getV() {
        return v;
    }

    public void setV(Vehicles v) {
        this.v = v;
    }
}