package com.lgy.demo2;

public class singleTon {
    public static void main(String[] args) {
        Girl instance = Girl.getInstance();


    }
}

class Girl {
    private static Girl girl = null;

    private Girl() {

    }

    public static Girl getInstance() {
        if (girl != null) {
            girl = new Girl();
        }
        return girl;
    }
}
