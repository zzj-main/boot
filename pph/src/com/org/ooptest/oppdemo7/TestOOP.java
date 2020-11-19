package com.org.ooptest.oppdemo7;


public class TestOOP {
    public static void main(String[] args) {

        Animal a = new Cat();
        a.setAge(10);
        a.setName("菲菲");
        System.out.println("name："+a.getName()+a.getAge()+"岁");
        a.eat();

        Animal a1 = new Cat("yang",12);
        System.out.println("name："+a1.getName()+a1.getAge()+"岁");
        a1.eat();




   }

}
