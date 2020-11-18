package com.org.extendstest;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        System.out.println(a.get(a) + " - " + a.get(d) + " - " + a.get(b) + " - " + b.get(a) + " - " + b.get(c) + " - "
                + b.get(d));
        System.out.println(a.get(b));

    }
}
