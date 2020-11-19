package com.org.ooptest.oopdemo1;

public class TestOOP {
    /**
     * 好处：
     * 多态提高了程序的扩展性，
     * 具体体现，定义方法的时候，使用父类型作为参数，将来在使用的时候，使用具体的子类型参与操作
     * 弊端
     * 不能使用子类的特有功能
     * @param args
     */

    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
       AnimalMethod am = new AnimalMethod();
       am.usefould(c);
       am.usefould(d);

    }

}
