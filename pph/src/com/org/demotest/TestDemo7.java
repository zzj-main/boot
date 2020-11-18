package com.org.demotest;

public class TestDemo7 {
    //比较数组是否相同
    public static void main(String[] args) {

        int[] a = {1, 2, 3,8};
        int[] b = {1, 2, 3};
        System.out.println(compare(a, b));
        System.out.println(compareB(a, b));
    }

    public static boolean compare(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] != b[j] && i == j) {
                    return false;
                }
            }
        }
        return true;
    }

    //第二种方法
    public static boolean compareB(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int j = 0; j < b.length; j++) {
            if (a[j] != b[j]) {
                return false;
            }
        }
        return true;
    }
}
