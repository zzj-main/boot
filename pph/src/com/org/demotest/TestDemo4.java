package com.org.demotest;

public class TestDemo4 {
    //不死神兔

    /**
     * 一对兔子，从出生后 3个月开始 每个月都生一对兔子，小兔子长到第三个月后，每个月又生一对兔子
     * 假如兔子不会死亡，第二十个月 兔子有多少对？
     */
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
//        arr[2] = arr[0] + arr[1];
//        arr[3] = arr[2] + arr[1];
//        arr[4] = arr[3] + arr[2];
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-2]+arr[i-1];
            System.out.println(arr[i]);
        }
        System.out.println("第二十个月的兔子对数："+arr[arr.length-1]);
    }
}
