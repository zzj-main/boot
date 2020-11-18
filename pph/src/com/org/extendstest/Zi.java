package com.org.extendstest;

public class Zi extends Fu{
    public int age = 50;

    public void show(){
        super.show();
        int age = 10;
        System.out.println("内部年龄"+age);
        System.out.println("全局年龄"+this.age);
        System.out.println("父类年龄"+super.age);

    }
    public  Zi(){
        System.out.println("zi");
    }
}
