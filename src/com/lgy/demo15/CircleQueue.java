package com.lgy.demo15;

public class CircleQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public CircleQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
    }

    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    public boolean isNull(){
        return front == rear;
    }

    public void addQueue(int num){
        if (isFull()) {
            System.out.println("队列已满");
            return;
        }
        arr[rear] = num;
        rear = (rear + 1) % maxSize;
    }

    public int getQueue(){
        if (isNull()) {
            System.out.println("队列为空");
            throw new RuntimeException("队列为空，不能取值");
        }
        int value =  arr[front];
        front = (front + 1) % maxSize;
        return value;
    }

    public void showQueue(){
        if (isNull()) {
            System.out.println("队列为空");
            return;
        }
        for (int i = 0; i < size(); i++) {
            System.out.printf("arr[%d]=%d\t", i % maxSize, arr[i % maxSize]);
        }
    }

    public int size(){
        return (rear + maxSize - front) % maxSize;
    }

    public int peek(){
        if (isNull()) {
            System.out.println("队列为空");
            throw new RuntimeException("111");
        }
        return arr[front];
    }
}
