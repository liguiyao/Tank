package com.lgy.demo18;

import java.util.*;

public class test1 {
    public static void main(String[] args) {
        Set<Car> set = new LinkedHashSet<>();
        set.add(new Car("BMW", 10000));
        set.add(new Car("FORD", 20000));
        set.add(new Car("BMW", 10000));

        Map<String, String> map = new HashMap<>();
        map.put("P3","初级开发");
        map.put("P4","中级开发");
        map.put("P6","高级开发");
        map.put("P8","架构师");

        Set<String> set1 = map.keySet();
        for (String s : set1) {
            System.out.println(s+"-"+map.get(s));
        }
        Iterator<String> iterator = set1.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + "-" + map.get(key));
        }
        Collection<String> values = map.values();

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        Iterator<Map.Entry<String, String>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, String> entry = iterator1.next();
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

//        System.out.println(set);
//
//        test1 test1 = new test1();
//        int[] nums = {10, 7, 5};
//        int[] new_ = test1.getIndex(nums, 12);
//        for (int i : new_) {
//            System.out.println(i);
//        }
    }

    public int[] getIndex(int[] nums,int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp =  nums[i];
            if (map.containsKey(target - temp)) {
                return new int[]{map.get(target-temp),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}

class Car {
    private String name;
    private int price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
