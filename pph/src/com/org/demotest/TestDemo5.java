package com.org.demotest;

public class TestDemo5 {
    //百钱百鸡

    /**
     * 公鸡 5块钱一只
     * 母鸡 3块钱一只
     * 小鸡 1块钱三只
     * 100块 需要买一百只鸡
     * 其中 公鸡，母鸡，小鸡各多少
     */
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {//i 表示 公鸡的值
            for (int j = 0; j <= 33; j++) {//j 表示母鸡的值
                int z = 100 - i - j; //需要买100只鸡
                if (z % 3 == 0 && 5 * i + 3 * j + z / 3 == 100) { //需要100块 买鸡
                    System.out.println(i + "," + j + "," + z);
                }

            }
        }
    }

}
