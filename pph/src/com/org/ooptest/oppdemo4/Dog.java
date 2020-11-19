package com.org.ooptest.oppdemo4;

public class Dog extends Animal {
    public Dog(int age, String name) {
        super(age, name);
    }

    public Dog() {
    }

    @Override
    public void eat() {
        System.out.println("小狗喜欢吃狗粮");
    }
}
