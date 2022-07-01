package com.lgy.demo23;

import java.util.*;

public class test {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();
        dao.save("1", new User(1, 18, "jack"));
        dao.save("2", new User(2, 28, "tom"));
        dao.save("3", new User(3, 38, "smith"));

        List<User> list = dao.list();
        for (Object o : list) {
            System.out.println(o);
        }
    }
}

class DAO<T> {
    public Map<String, T> map = new HashMap<>();

    public void save(String id,T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {
        Set<Map.Entry<String, T>> entries = map.entrySet();
        ArrayList<T> list = new ArrayList<>();
        for (Map.Entry<String, T> entry : entries) {
            list.add(entry.getValue());
        }
        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }
}

class User {
    private int id;
    private int age;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int id, int age, String name) {

        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}