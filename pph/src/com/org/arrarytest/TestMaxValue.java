package com.org.arrarytest;

public class TestMaxValue {
    /**
     * 数组中求最值demo
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {12,22,11,23,55};

        int maxVal = array[0];
        for (int i = 1; i <array.length ; i++) {
            if(array[i]<maxVal){
                maxVal = array[i];
            }
        }
        System.out.println("最小为："+maxVal);

        for (int i = 1; i <array.length ; i++) {
            if(array[i]>maxVal){
                maxVal = array[i];
            }
        }
        System.out.println("最大为："+maxVal);
    }
}
