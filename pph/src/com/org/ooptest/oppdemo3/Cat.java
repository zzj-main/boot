package com.org.ooptest.oppdemo3;

public class Cat extends Animal {
    int age = 99;
    int weight = 20;

    @Override
    public  void eat() {
        System.out.println("猫想吃鱼");
    }
}
