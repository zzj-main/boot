package com.yanqiang.boot.study;

public class TestZF {
    /**
     * 一张纸的厚度大约是0.01mm，对折多少次之后能达到珠穆朗玛峰的高度（8848.13米）？
     */
    public static void main(String[] args) {
        double highzf = 8848130;//转化为毫米
        double paper = 0.1;
        int count = 0;
        while (paper<=highzf){
            paper = paper*2;
            count++;
            System.out.println("当前第"+count+"次,厚度"+paper);
        }
        System.out.println("一共需要对折"+count+"次,将超过");
    }
}
