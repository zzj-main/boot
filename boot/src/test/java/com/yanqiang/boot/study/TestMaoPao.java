package com.yanqiang.boot.study;

public class TestMaoPao {
    //简单冒泡排序
    public static void main(String[] args) {
        int [] array = {22,31,51,12,11,19};
        //排序 需要循环
        for (int i = 0; i <array.length-1 ; i++) {//外层循环-1
            for (int j = 0; j <array.length-i-1 ; j++) {//内层循环-i-1
                if(array[j]>array[j+1]){//若当前位置数据大于后一位数据，需要调换位置
//                    int temp = array[j+1];
//                    array[j+1] = array[j];
//                    array[j] = temp;
                    //或者 只是换位置的方法不同
                    int temp2 = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp2;
                }
            }
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
