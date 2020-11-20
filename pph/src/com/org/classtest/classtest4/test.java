package com.org.classtest.classtest4;

public class test {
    public static void main(String[] args) {
        JumpUser ju = new JumpUser();
        ju.method(new Jump() {
            @Override
            public void jump() {
                System.out.println("这是一直猫在蹦跶");
            }
        });

        ju.method(new Jump() {
            @Override
            public void jump() {
                System.out.println("这是一条狗在蹦跶");
            }
        });
    }
}
