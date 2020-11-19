package com.org.arrarytest;

public class TestSort {
    public static void main(String[] args) {
        int[] arr = {55, 22, 23, 66, 11};
        System.out.print("排序前：");
        printsort(arr);
        sort(arr);
        System.out.print("排序后：");
        printsort(arr);
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
