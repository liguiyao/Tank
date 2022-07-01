package com.lgy.demo8;

public class test1 {
    public static void main(String[] args) {
        A a = new A();
        a.temp();
    }
}

class A{
    private final String name = "AAA";
    public void temp(){
        class B{
            private final String name = "BBBB";
            public void show(){
                System.out.println(A.this.name);
            }
        }

        B b = new B();
        b.show();
    }
}
