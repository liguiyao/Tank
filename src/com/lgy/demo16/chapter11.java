package com.lgy.demo16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
@SuppressWarnings("all")
public class chapter11 {
    public static void main(String[] args) {
        Book book = new Book("三国", 20, "罗贯中");
        Book book2 = new Book("西游", 10, "施耐庵");
        Book book3 = new Book("红楼", 50, "曹雪芹");

        ArrayList<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book2);
        books.add(book3);

        for (int i = 0; i < books.size(); i++) {
            for (int j = 0; j < books.size() - i - 1; j++) {
                if (books.get(j).getPrice() > books.get(j + 1).getPrice()) {
                    Book temp = books.get(j);
                    books.set(j, books.get(j + 1));
                    books.set(j + 1, temp);
                }
            }
        }

        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book next = iterator.next();
            System.out.println(next);
        }

    }
}
class Book {
    private String name;
    private int price;
    private String author;

    public Book(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
