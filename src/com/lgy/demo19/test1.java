package com.lgy.demo19;

import java.util.*;

public class test1 {
    public static void main(String[] args) {
        Map<String, Employee> map = new HashMap<>();
        map.put("001", new Employee("张三",1000));
        map.put("002", new Employee("李四",19000));
        map.put("003", new Employee("王五", 20000));

        Set<Map.Entry<String, Employee>> entrySet = map.entrySet();
        for (Map.Entry<String, Employee> entry : entrySet) {
            if (entry.getValue().salary > 18000) {
                System.out.println(entry.getKey() + "-" + entry.getValue());
            }
        }
        Iterator<Map.Entry<String, Employee>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Employee> next = iterator.next();
            if (next.getValue().salary > 18000) {
                System.out.println(next.getKey() + "-" + next.getValue());
            }
        }
        ArrayList<Object> list = new ArrayList<>();

        Collections.sort(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
    }
}

class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
