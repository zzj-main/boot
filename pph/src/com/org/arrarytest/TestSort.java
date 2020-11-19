package com.org.arrarytest;

import java.util.Scanner;

public class TestSort {
    public static void main(String[] args) {
        //让用户输入一个数组进行排序
        int[] arr = new int[5];
        getArray(arr);
        System.out.print("排序前：");
        printsort(arr);
        sort(arr);
        System.out.print("排序后：");
        printsort(arr);
    }

    public static void getArray(int[] arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入数字：");
            int num = sc.nextInt();
            arr[i] = num;
        }
    }

    public static void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printsort(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }
}
