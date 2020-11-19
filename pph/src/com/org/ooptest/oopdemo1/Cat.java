package com.org.ooptest.oopdemo1;

public class Cat extends Animal {
    int age = 99;
    int weight = 20;

    @Override
    public  void eat() {
        System.out.println("猫想吃鱼");
    }
}
