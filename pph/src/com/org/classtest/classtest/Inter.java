package com.org.classtest.classtest;

public class Inter {
    int num = 20;

    private class test{
        public void show(){
            System.out.println(20);
        }
    }

    public void method(){
        test t = new test();
        t.show();
    }
}
