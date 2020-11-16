package com.yanqiang.boot.study;

public class TestXunHuan {
    //嵌套循环 输出一天的小时分钟
    public static void main(String[] args) {
        for (int hour = 0; hour <24 ; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                System.out.println(hour+"时"+minute+"分");
            }
            System.out.println("------------------------");
        }
    }

}
