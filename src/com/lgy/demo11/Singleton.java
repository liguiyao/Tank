package com.lgy.demo11;

public class Singleton {
    public static void main(String[] args) {
        Girl girl = Girl.getInstance();
        System.out.println(girl);
    }
}
class Girl{
    private static Girl girl;

    private Girl() {
    }
    @SuppressWarnings("all")
    public static Girl getInstance() {
        if (girl == null) {
            girl = new Girl();
        }
        return girl;
    }
}
