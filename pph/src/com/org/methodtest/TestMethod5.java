package com.org.methodtest;

public class TestMethod5 {
    //带返回值的方法定义,调用
     /**
     *
     * @param args
     */
    public static void main(String[] args) {
        boolean flag = methodTest(10);
        System.out.println(flag);
        System.out.println(getMax(45,22));
    }

    //判断是否为偶数
    public static boolean methodTest(int num){
        if(num % 2 == 0){
           return true;
        }else{
            return false;
        }
    }

    public static int getMax(int a,int b){
        if(a > b){
            return a;
        }else {
            return b;
        }
    }
}
