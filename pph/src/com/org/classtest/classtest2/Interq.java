package com.org.classtest.classtest2;

public class Interq {
    int num =100;
    public void method(){
        class test2{
            int age = 90;
            public void show(){
                System.out.println("1111==="+num);
                System.out.println("2222==="+age);
            }
        }
        test2 test2 = new test2();
        test2.show();
    }
}
