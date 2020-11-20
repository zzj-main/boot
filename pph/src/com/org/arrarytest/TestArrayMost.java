package com.org.arrarytest;

public class TestArrayMost {
    public static void main(String[] args) {
        int[] mq = {22,25,65,98,21};
        System.out.println("排序前："+printsort(mq));

        for (int i = 0; i <mq.length-1-0 ; i++) {
            if(mq[i]>mq[i+1]){
                int temp = mq[i];
                mq[i] = mq[i+1];
                mq[i+1] = temp;
            }
        }
        System.out.println("排序1："+printsort(mq));
        for (int i = 0; i <mq.length-1-1 ; i++) {
            if(mq[i]>mq[i+1]){
                int temp = mq[i];
                mq[i] = mq[i+1];
                mq[i+1] = temp;
            }
        }
        System.out.println("排序2："+printsort(mq));
        for (int i = 0; i <mq.length-1-2 ; i++) {
            if(mq[i]>mq[i+1]){
                int temp = mq[i];
                mq[i] = mq[i+1];
                mq[i+1] = temp;
            }
        }
        System.out.println("排序3："+printsort(mq));
        for (int i = 0; i <mq.length-1-3 ; i++) {
            if(mq[i]>mq[i+1]){
                int temp = mq[i];
                mq[i] = mq[i+1];
                mq[i+1] = temp;
            }
        }
        System.out.println("排序4："+printsort(mq));

        for (int i = 0; i <mq.length-1 ; i++) {
            for (int j = 0; j <mq.length-1-i ; j++) {
                if(mq[j]>mq[j+1]){
                    int temp = mq[j];
                    mq[j+1] = mq[j];
                    mq[j] = temp;
                }
            }
        }
        System.out.println("排序后："+printsort(mq));

    }

    public static String printsort(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
