package com.org.demotest;

public class TestDemo9 {
    /**
     * 数组的反转
     */
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};

        //数组反转
        resver(a);
        //遍历数组
        arraySort(a);
    }

    public static void resver(int[] a) {
        //循环定义两个参数，一个数字首位，一个数组末位
        //进行对折调位
        // 首位++ 末位--且 首位下标永远不大于末位下标
        for (int start = 0, end = a.length - 1; start <= end; start++, end--) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
        }
    }

    public static void arraySort(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print(a[i]);
            } else {
                System.out.print(a[i] + ",");
            }
        }
        System.out.println("]");

    }
}
