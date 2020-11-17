package com.org;

public class zzj {
    public static void main(String[] args) {
       int [] num = {1,10,100};
       System.out.println(num[1]);
       change(num);
       System.out.println(num[1]);
    }
    public static void change(int [] arr){
        arr[1] = 200;
    }
}
