package com.org.ooptest.oppdemo4;

public class TestOOP {
    public static void main(String[] args) {

        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println("一只"+a.getAge()+"岁的猫，叫"+a.getName());
        a.eat();

        a = new Dog();
        a.setAge(10);
        a.setName("西瓜");
        System.out.println("一条"+a.getAge()+"岁的狗，叫"+a.getName());
        a.eat();
    }

}
