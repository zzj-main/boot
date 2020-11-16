package com.yanqiang.boot.study;

public class TestJava {
    public static void main(String[] args) {
        //三位数字的水仙花数字
        int endNum = 0;
        int midNum = 0;
        int firNum = 0;
        int count = 0;

        for (int i = 100; i <1000 ; i++) {
            endNum = i%10;
            midNum = i/10%10;
            firNum = i/100%10;
            //math的pow函数 可以表示 某数的多少次放 但是里面为double类型需要注意
            if(Math.pow(endNum,3)+Math.pow(midNum,3)+Math.pow(firNum,3) == i){
                count++;
                System.out.println("水仙花的数字为："+i);

            }
        }
        System.out.println("100-1000一共有"+count+"个水仙花数字");
    }
}
