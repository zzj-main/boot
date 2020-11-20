package com.org.objecttest;

public class Student {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        /**
         * this ===s1
         * o   ===s2
         */
        //首先比较两个对象的内存地址是否相同
        if (this == o) return true;
        //判断这个对象是否来自于同一个类
        if (o == null || getClass() != o.getClass()) return false;
        //向下转型
        Student student = (Student) o;
        //比较年龄是否相同
        if (age != student.age) return false;
        //姓名是否相同
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
