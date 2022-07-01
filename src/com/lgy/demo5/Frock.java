package com.lgy.demo5;

public class Frock {
    private static int currentNum = 100000;
    private int serialNumber;

    public int getSerialNumber() {
        return serialNumber;
    }
    public static int getNextNum() {
        System.out.println(currentNum += 100);
        return currentNum;
    }

    public Frock() {
        serialNumber = getNextNum();
    }
}

class TestFrock {
    public static void main(String[] args) {
        Frock frock = new Frock();
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();

    }
}
