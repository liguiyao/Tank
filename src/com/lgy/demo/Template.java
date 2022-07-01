package com.lgy.demo;

public abstract class Template {
    public abstract void job();

    public long calculate() {
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();

        return end-start;
    }
}
