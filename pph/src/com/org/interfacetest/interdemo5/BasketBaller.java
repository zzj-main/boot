package com.org.interfacetest.interdemo5;

public class BasketBaller extends Teacher {
    @Override
    public void eat() {
        System.out.println("篮球教练想吃大骨头");
    }

    @Override
    public void teach() {
        System.out.println("今天教学生练习打篮球");
    }

    public BasketBaller(String name, int age) {
        super(name, age);
    }

    public BasketBaller() {
        super();
    }
}
