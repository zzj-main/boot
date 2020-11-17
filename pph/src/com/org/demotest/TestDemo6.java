package com.org.demotest;

public class TestDemo6 {
    //数组元素求和

    /**
     * 求和的元素个位，十位都不能是7 并且只能是偶数
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] num = {17, 72, 8, 171, 210, 999};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0 && num[i] % 10 != 7 && num[i] / 10 % 10 != 7) {
                sum += num[i];
            }
        }
        System.out.println(sum);
    }
}
