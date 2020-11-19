package com.org.ooptest.oppdemo6;

public abstract class Animal {

//    public void eat(){
//        System.out.println("吃东西");
//    }

    public abstract void eat();

    public void sleep(){
        System.out.println("睡觉");
    }
    private int age = 20;
    private final String city = "北京";
    public void show(){
        age = 49;
        System.out.println(age);
//        city = "11";
    }
    public abstract void eate();

    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }
}
