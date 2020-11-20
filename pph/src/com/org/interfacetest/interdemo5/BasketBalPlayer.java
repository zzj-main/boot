package com.org.interfacetest.interdemo5;

public class BasketBalPlayer extends Player{
    @Override
    public void eat() {
        System.out.println("篮球运动员吃玉米");
    }

    public BasketBalPlayer(String name, int age) {
        super(name, age);
    }

    public BasketBalPlayer() {
        super();
    }

    @Override
    public void study() {
        System.out.println("今天学习打篮球");
    }
}
