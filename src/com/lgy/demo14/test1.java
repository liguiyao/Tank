package com.lgy.demo14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class test1 {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("红楼梦", 100.5);
        books[1] = new Book("水浒传", 80.6);
        books[2] = new Book("三国演义", 80.5);
        books[3] = new Book("西游记", 80.7);
        books[4] = new Book("Java从入门到放弃", 93.5);

        System.out.println(1%3+"================");

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPrice() - o2.getPrice() > 0) {
                    return 1;
                } else if (o1.getPrice() - o2.getPrice() < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("================================");
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getName().length() - o2.getName().length() > 0) {
                    return -1;
                } else if (o1.getName().length() - o2.getName().length() < 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        for (Book book : books) {
            System.out.println(book);
        }

        int[] lc = new test1().getLC(new int[]{1, 2, 3,7}, 9);
        for (int i : lc) {
            System.out.print(i+"\t");
        }
    }

    public int[] getLC(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            if (map.containsKey(target-number)) {
                return new int[]{map.get(target-number), i};
            }
            map.put(number, i);
        }
        return new int[0];
    }
}

class Book {
    private String name;
    private Double price;

    public Book(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
