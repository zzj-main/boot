package com.yanqiang.boot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootApplicationTests {

    @Test
    void contextLoads() {
    }

    /**
     * 冒泡排序
     * @param args
     */
    public static void main(String[] args) {

        //java 快速排序 sort
        int [] mq ={5,2,3,9,1};
//        List list = new ArrayList();
//        for (int i = 0; i < mq.length; i++) {
//            list.add(mq[i]);
//        }
//        Collections.sort(list);
//        for (int i = 0; i <list.size() ; i++) {
//            System.out.println(list.get(i));
//        }
//        System.out.println();

        //冒泡排序
        for (int i = 0; i <mq.length-1 ; i++) {
            for (int j = 0; j <mq.length-1-i; j++) {
                if(mq[j]>mq[j+1]){
                    int temp = mq[j];
                    mq[j]=mq[j+1];
                    mq[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < mq.length; i++) {
            System.out.println(mq[i]);
        }
    }

}
