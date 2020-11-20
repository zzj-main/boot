package com.org.interfacetest.interdemo5;

public class DemoTest {
    public static void main(String[] args) {
       Speak sk = new PingPangBallPlayer ();
       ((PingPangBallPlayer) sk).setAge(1);
       ((PingPangBallPlayer) sk).setName("嘿嘿");
        System.out.println(((PingPangBallPlayer) sk).getAge()+((PingPangBallPlayer) sk).getName());
       sk.speakEnglish();
       ((PingPangBallPlayer) sk).eat();
        System.out.println("-----------------------");
       PingPangBallPlayer pp = new PingPangBallPlayer();
       pp.setAge(11);
       pp.setName("ageq");
        System.out.println(pp.getAge()+pp.getName());
       pp.eat();
       pp.speakEnglish();
       pp.study();
    }
}
