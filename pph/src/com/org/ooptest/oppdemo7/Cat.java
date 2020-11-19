package com.org.ooptest.oppdemo7;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("123");
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }
}
