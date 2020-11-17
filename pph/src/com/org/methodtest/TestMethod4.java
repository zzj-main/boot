package com.org.methodtest;

public class TestMethod4 {
    public static void main(String[] args) {
        //形参：方法定义中的参数 eg int num
        //实参：方法调用中的参数 eg 10（常量值）  num（变量名）
        //常量
        getMax(10,20);
        //变量
        int aa = 30;
        int bb = 40;
        getMax(aa,bb);

    }

    /**
     * 参数调用的 对比 大小数据
     */
    public static void  getMax(int num,int pap){
        if(num>pap){
            System.out.println(num);
        }else {
            System.out.println(pap);
        }
    }
}
