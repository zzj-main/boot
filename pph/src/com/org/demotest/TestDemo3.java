package com.org.demotest;

public class TestDemo3 {
    //逢7过 小游戏

    public static void main(String[] args) {
        int cout = 0;
        for (int i = 1; i <=100 ; i++) {
            if(i%7==0||i%10==7||i/10%10==7){
                System.out.println(i);
                cout++;
            }
        }
        System.out.println("一共："+cout+"个");
    }
}
