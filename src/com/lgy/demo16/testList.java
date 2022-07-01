package com.lgy.demo16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@SuppressWarnings({"all"})
public class testList {


    public static void main(String[] args) {
//        ArrayList<Object> list = new ArrayList<>();
//
//        list.add(10);
//
//        System.out.println("1111");

//        Set set = new HashSet();
//        set.add("jack");
//        set.add("java");
//        set.add("jack");
//        System.out.println(set);
        Employee e1 = new Employee("张三", 14);
        Employee e2 = new Employee("李四", 34);
        Employee e3 = new Employee("王五", 19);
        Employee e4 = new Employee("王五", 19);
        Set<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);

        System.out.println(set);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
