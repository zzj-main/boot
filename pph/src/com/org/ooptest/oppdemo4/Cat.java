package com.org.ooptest.oppdemo4;

public class Cat extends Animal {
    public Cat(int age, String name) {
        super(age, name);
    }

    public Cat() {
    }

    @Override
    public void eat() {
        System.out.println("小猫喜欢吃鱼");
    }
}
