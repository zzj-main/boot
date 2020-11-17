package com.org.methodtest;

public class TestMethod6 {
    public static void main(String[] args) {
        //方法重载
        // 指相同的一个类中定义的多个方法之间的关系。
        /**
         * 多个方法在同一个类中
         *         具有相同的方法名
         *         参数不相同，类型不同或者数量不同
         */
        //特点 不能通过返回值进行判断是否重载
        int m = num(1,2);
        double n = num(1.0,2.0);
        int q = num(1,2,3);
        System.out.println(m+","+n+","+q);




    }

    public static int num(int a,int b){
        return a+b;
    }
    public static int num(int a,int b,int c){
        return a+b+c;
    }
    public static double num(double a,double b){
        return a+b;
    }
}
