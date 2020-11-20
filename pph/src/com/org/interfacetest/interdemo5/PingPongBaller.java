package com.org.interfacetest.interdemo5;

public class PingPongBaller extends Teacher implements Speak{
    @Override
    public void eat() {
        System.out.println("今天吃鱼儿偶");
    }

    @Override
    public void teach() {
        System.out.println("今天教学生乒乓球");
    }

    public PingPongBaller(String name, int age) {
        super(name, age);
    }

    public PingPongBaller() {
        super();
    }

    @Override
    public void speakEnglish() {
        System.out.println("老师学习说英文");
    }
}
