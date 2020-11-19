package com.org.interfacetest.interdemo2;

public class InterDemo {
    public static void main(String[] args) {

        Inter i = new InterImpl();
//        i.num =10;
        System.out.println(i.num);
        System.out.println(i.aa);
        System.out.println(Inter.aa);
    }
}
