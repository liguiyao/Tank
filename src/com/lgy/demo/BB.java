package com.lgy.demo;

public class BB extends Template{

    @Override
    public void job() {
        for (int i = 0; i < 3000000; i++) {
            if (i != 100) {
                int s = 0;
            } else {
                System.out.println("111");
            }
        }
    }
}
