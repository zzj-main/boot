package com.org.classtest.classtest3;

public class InterDemo {
    public static void main(String[] args) {
        TestDemo td = new TestDemo();
        td.method();
        System.out.println("------------------");
        td.opp(new Inter() {
            @Override
            public void eat() {
                System.out.println("12431432");
            }

            @Override
            public void show() {
                System.out.println("asdfasdf");
            }
        });
    }
}
