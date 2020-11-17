package com.org.methodtest;

public class TestMethod2 {
    //使用方法调用打印较大数字
    public static void main(String[] args) {
        getMax();
    }

    public static void getMax(){
        int a = 20;
        int b = 30;
        if(a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
}
