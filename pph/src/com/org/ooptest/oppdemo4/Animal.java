package com.org.ooptest.oppdemo4;

public class Animal {
    public int age;
    public String name;

    public void eat(){
        //System.out.println("动物都喜欢吃食物");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
