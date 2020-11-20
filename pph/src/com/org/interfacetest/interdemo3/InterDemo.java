package com.org.interfacetest.interdemo3;

public class InterDemo {
    public static void main(String[] args) {

        Inter i = new InterImpl();
//        i.num =10;
        System.out.println(i.num);
        System.out.println(i.aa);
        System.out.println(Inter.aa);

        Inter it = new Cat();
        it.eat();
    }
}
