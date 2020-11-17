package com.org.methodtest;

public class TestMethod {
    //方法学习测试
    //执行步骤 先执行 main 方法 在main中找到method 继续寻找方法执行。
    public static void main(String[] args) {
        //调用方法 如果不存在此方法强制调用，会报错不存在该符号。
        //先声明在调用
        methodTest();
    }
    //判断是否为偶数
    public static void methodTest(){
        int num = 9;
        if(num % 2 == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
