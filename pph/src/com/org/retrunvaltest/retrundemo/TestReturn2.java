package com.org.retrunvaltest.retrundemo;

public class TestReturn2 {
    public static void main(String[] args) {
        Anmail a = new Dog();
        a.eat();

        AnmailUser au = new AnmailUser();
        Anmail getanmail = au.getanmail();
        getanmail.eat();

        Anmail a1 = new Dog();
        au.show(a1);
    }
}
