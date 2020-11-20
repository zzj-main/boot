package com.org.objecttest;

public class TestObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(22);
        s1.setName("张三");
        Student s2 = new Student();
        s2.setAge(22);
        s2.setName("张三");

        System.out.println(s1.equals(s2));

    }
}
