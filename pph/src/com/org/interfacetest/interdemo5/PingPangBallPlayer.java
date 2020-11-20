package com.org.interfacetest.interdemo5;

public class PingPangBallPlayer extends Player implements Speak{
    @Override
    public void eat() {
        System.out.println("PingPangBallPlayer吃水果");
    }

    public PingPangBallPlayer(String name, int age) {
        super(name, age);
    }

    public PingPangBallPlayer() {
        super();
    }

    @Override
    public void study() {
        System.out.println("PingPangBallPlayer学习打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("学生学习说英文");
    }
}
