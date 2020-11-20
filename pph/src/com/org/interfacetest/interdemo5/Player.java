package com.org.interfacetest.interdemo5;

public abstract class Player extends Human{
    @Override
    public void eat() {
        System.out.println("运动员吃完美食物");
    }

    public Player(String name, int age) {
        super(name, age);
    }

    public Player() {
    }
    public abstract void study();
}
