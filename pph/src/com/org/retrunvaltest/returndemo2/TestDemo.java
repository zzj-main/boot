package com.org.retrunvaltest.returndemo2;

public class TestDemo {
    public static void main(String[] args) {
        JumpUser ju = new JumpUser();
        Jump getjump = ju.getjump();

        getjump.jump();

        Jump j1 = new Cat();
        ju.show(j1);



    }
}
