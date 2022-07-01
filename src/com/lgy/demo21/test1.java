package com.lgy.demo21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee employee = new Employee("jack", 123.4, new MyDate(2008, 12, 12));
        Employee employee2 = new Employee("lee", 678.4, new MyDate(2002, 11, 12));
        Employee employee3 = new Employee("lee", 223.4, new MyDate(2000, 2, 12));

        list.add(employee);
        list.add(employee2);
        list.add(employee3);
        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int count = o1.getName().compareTo(o2.getName());
                if (count != 0) {
                    return count;
                }
                return o1.getBirthday().getFullBirthday().compareTo(o2.getBirthday().getFullBirthday());

            }
        });

        System.out.println(list);

    }
}

class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public String getFullBirthday() {
        return String.valueOf((getYear() + getMonth() + getDay()));
    }
}
