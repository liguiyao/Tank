package com.lgy.demo15;

public class ArrayQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = -1;
        rear = -1;
    }

    public boolean isFull() {
        return rear == maxSize-1;
    }

    public boolean isNull(){
        return front == rear;
    }

    public void addQueue(int num){
        if (isFull()) {
            System.out.println("队列已满");
            return;
        }
        arr[++rear] = num;
    }

    public int getQueue(){
        if (isNull()) {
            System.out.println("队列为空");
            throw new RuntimeException("队列为空，不能取值");
        }
        return arr[++front];
    }

    public void showQueue(){
        if (isNull()) {
            System.out.println("队列为空");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\t",i,arr[i]);
        }
    }

    public int peek(){
        if (isNull()) {
            System.out.println("队列为空");
            throw new RuntimeException("111");
        }
        return arr[front + 1];
    }
}
