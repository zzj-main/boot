package com.org.arrarytest;

public class TestMaoPaoArray {
    public static void main(String[] args) {
        int[] array = {99,22,11,23,55};
        //针对数组进行冒泡排序
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = 0; j <array.length-1-i ; j++) {
                //循环对比数字内相邻两个值进行调换位置
                if(array[j]>array[j+1]){  //如果第j位的值 大于 j+1 的值
                    int temp = array[j]; //声明temp 得到 第j位的值
                    array[j] = array[j+1];//第j位 被 赋值为 j+1的值
                    array[j+1] = temp;   //最后将temp的值赋值给 j+1的 冒泡排序完毕
                }
            }
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
