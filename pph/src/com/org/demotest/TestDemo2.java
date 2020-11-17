package com.org.demotest;

import java.util.Scanner;

public class TestDemo2 {
    //减肥计划 switch 实现
    //导包 手动，快捷键 自动，
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入日期：");
        int week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("周一吃");
                break;
            case 2:
                System.out.println("周2吃");
                break;
            case 3:
                System.out.println("周3吃");
                break;
            case 4:
                System.out.println("周4吃");
                break;
            case 5:
                System.out.println("周5吃");
                break;
            case 6:
                System.out.println("周6吃");
                break;
            case 7:
                System.out.println("周7吃");
                break;
            default:
                System.out.println("日期不太对");
                break;
        }
    }
}
