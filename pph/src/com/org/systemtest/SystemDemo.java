package com.org.systemtest;

public class SystemDemo {
    public static void main(String[] args) {
//        System.out.println("---------------1");
//        System.exit(0);
//        System.out.println("---------------2");
//        System.out.println(System.currentTimeMillis()*1.0/1000/60/60/24/365);

        //方法体 的执行时间
        long star = System.currentTimeMillis();
        for (int i = 0; i <10000 ; i++) {
            System.out.println(i);
        }
        long end =System.currentTimeMillis();
        System.out.println(end-star+"毫秒");



    }
}
