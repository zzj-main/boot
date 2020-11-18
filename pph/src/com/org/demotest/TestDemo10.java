package com.org.demotest;

import java.util.Scanner;

public class TestDemo10 {
    //评委打分
/**
 * 引用类型直接修改值
 */
    /**
     * 去掉一个最高，一个最低 算出平均分
     * 要求能输入分数
     */
    public static void main(String[] args) {

        int[] arr = new int[6];
        //输入相关参数
        input(arr);

        int sum = sumNum(arr) - getMax(arr) - getMin(arr);
        double devNum = (double)sum / (double)(arr.length - 2);
        System.out.println(devNum);
    }

    public static void input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入分数");
            int num = sc.nextInt();
            arr[i] = num;
        }
    }

    /**
     * 得到数组中最大值
     *
     * @param arr
     * @return
     */
    public static int getMax(int[] arr) {
        int maxNum = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    /**
     * 得到数组中最小值
     *
     * @param arr
     * @return
     */
    public static int getMin(int[] arr) {
        int minNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minNum) {
                minNum = arr[i];
            }
        }
        return minNum;
    }

    /**
     * 求和
     *
     * @param arr
     * @return
     */
    public static int sumNum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void arrSort(int[] arr) {
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
