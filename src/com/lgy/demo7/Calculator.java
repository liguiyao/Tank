package com.lgy.demo7;

public interface Calculator {
    void work();

}

class CellPhone {
    public void testWork(Calculator c){
        System.out.println("hahah");
        c.work();
    }
}
class test{
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.testWork(new Calculator() {
            @Override
            public void work() {
                System.out.println("匿名内部类");
            }
        });

    }
}
class ListNode{

}
