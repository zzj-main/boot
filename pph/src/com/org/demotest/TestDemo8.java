package com.org.demotest;

import java.util.Scanner;

public class TestDemo8 {
    //查找

    /**
     * 根据录入的值，来查找数组的索引，输出该索引
     */
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 8};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        int num = scanner.nextInt();
        int qm = find(a, num);
        System.out.println(qm == -1 ? "未找到" : "下标索引：" + qm);
    }

    /**
     * 调用方法
     * @param a
     * @param num
     * @return
     */
    public static int find(int[] a, int num) {
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (num == a[i]) {
                index = i;
                break;
            }
        }
        return index;
    }
}
