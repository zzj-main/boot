package com.org.arrarytest;

import java.util.Arrays;

public class TestSort2 {
    public static void main(String[] args) {
        int[] arr = {1,22,55,77,33};
        System.out.println("排序前:"+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后:"+Arrays.toString(arr));
    }
}
