package com.org.ooptest.oopdemo;

public class TestOOP {
    /**
     * 多态成员访问特点
     * 成员变量：编译，执行都看左边
     *
     * 由于继承 重写
     * 成员方法：编译看左边 ，执行看右边
     * @param args
     */
    public static void main(String[] args) {
        Animal animal = new Cat();//多态
        System.out.println(animal.age); //成员变量，取值看左边
       animal.eat();//方法执行重写 看右边

    }

}
