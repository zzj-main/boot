package com.org.demotest;

import java.util.Scanner;

public class TestDemo {
    /**
     * 减肥计划
     * 一周每天干某件事 if判断实现
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        int week = sc.nextInt();
        if (week > 7 || week < 1) {
            System.out.println("日期输入错误！");
        } else if (week == 1) {
            System.out.println("周一吃鱼");
        } else if (week == 2) {
            System.out.println("周二吃米");
        } else if (week == 3) {
            System.out.println("周三吃鸡");
        } else if (week == 4) {
            System.out.println("周四吃猪");
        } else if (week == 5) {
            System.out.println("周五吃羊");
        } else if (week == 6) {
            System.out.println("周六吃牛");
        } else {
            System.out.println("周日吃面");
        }

    }
}
