package com.org.extendstest;

public class B extends A{
    String get(A a) {
        return "BA";
    }

    String get(B b) {
        return "BB";
    }

}
