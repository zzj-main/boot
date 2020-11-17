package com.org.arrarytest;

public class TestArray {
    public static void main(String[] args) {
        //数组动态初始化
        //左边为栈内存（局部变量）使用完毕立即消失
                                // 右边为堆内存（实体，对象） 空闲时会被gc回收
        int [] arr =             new int[3];
        /**
         * int:整数型
         * []: 标志为一个数组
         * arr：声明数字名称
         *
         * new：申请数组内存
         * int:其元素为整数型
         * [3]:数组元素个数为3个
         */
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
