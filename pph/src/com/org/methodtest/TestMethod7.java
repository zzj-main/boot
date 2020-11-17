package com.org.methodtest;

/**
 * 类型转换和重载练习
 */
public class TestMethod7 {
    public static void main(String[] args) {
        System.out.println(compare(10,20));
        System.out.println(compare((byte) 1,(byte)2));
        System.out.println(compare((short) 20,(short)30));
        System.out.println(compare(9L,10L));

    }

    public static boolean compare(int a,int b){
        System.out.println("int");
        return a==b;
    }
    public static boolean compare(long a,long b){
        System.out.println("long");
        return a==b;
    }
    public static boolean compare(short a,short b){
        System.out.println("short");
        return a==b;
    }
    public static boolean compare(byte a,byte b){
        System.out.println("byte");
        return a==b;
    }
}
