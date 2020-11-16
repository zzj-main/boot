package com.yanqiang.boot.study;

import java.util.Random;
import java.util.Scanner;

public class TestRandom {
    public static void main(String[] args) {
        //随机数
//        Random r = new Random();
//        for (int i = 0; i <10 ; i++) {
//            int  a = r.nextInt(10);//获取0-9的随机数字。
//            System.out.println(a);
//        }
//        /*
//        1-100的随机数  r.nextInt(100) 取0-99 +1后得到 1-100
//         */
//        int randomNum = r.nextInt(100)+1;
//        System.out.println(randomNum+","+Math.random());
        //猜数字
        Random r = new Random();
        int num = r.nextInt(100)+1;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的数字：");
            int gressNum = sc.nextInt();
            if (gressNum > num) {
                System.out.println("大了");
            } else if (gressNum < num) {
                System.out.println("小了");
            } else {
                System.out.println("正好");
                break;
            }
        }
    }
}
