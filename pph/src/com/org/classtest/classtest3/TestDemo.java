package com.org.classtest.classtest3;

public class TestDemo implements Inter{


    public void method(){

//        new Inter(){
//            @Override
//            public void eat() {
//                System.out.println("吃什么东西？？？");
//            }
//        }.eat();
//
//        new Inter(){
//            @Override
//            public void eat() {
//                System.out.println("吃什么东西？？？");
//            }
//        }.eat();

        Inter i = new Inter(){
            @Override
            public void eat() {
                System.out.println("吃什么东西？？？");
            }

            @Override
            public void show() {
                System.out.println("sadfasdf");
            }
        };
        i.eat();
        i.eat();
    }

    @Override
    public void eat() {

    }

    @Override
    public void show() {

    }

    public void opp(Inter j){
        j.show();
        j.eat();
    }
}
