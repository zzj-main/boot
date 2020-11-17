package com.org.methodtest;

public class TestMethod3 {
    /**
     * 带参数的方法定义跟调用
     */
    public static void main(String[] args) {
        //常量调用
        methodTest(13);
        //变量调用
        int number = 15;
        methodTest(number);
    }
    /**
     * 定义方法
     * 注意：
     * 定义方法时：参数中的数据类型与变量名都不能缺少，缺少任意一个程序将报错
     * 多个参数之间使用逗号（,）分隔
     */
    /**
     * 调用方法
     * 注意：
     * 参数的数量和类型必须和定义的设置相匹配，否则程序将报错
     */
    //判断是否为偶数
    public static void methodTest(int num){
        if(num % 2 == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

}
