package com.org.classtest.classtest3;

public class TestDemo {


    public void method(){

        new Inter(){
            @Override
            public void eat() {
                System.out.println("吃什么东西？？？");
            }
        }.eat();
    }
}
