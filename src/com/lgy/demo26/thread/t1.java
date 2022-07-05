package com.lgy.demo26.thread;

public class t1 {
    public static void main(String[] args) throws InterruptedException {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("主线程 eat:" + i);
            Thread.sleep(1000);
            if (i == 5) {
                thread.join();
            }
        }

    }
}

class Cat extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread - ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Dog implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello , world ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Duck implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
