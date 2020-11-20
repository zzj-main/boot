package com.org.interfacetest.interdemo5;

public abstract class Teacher extends Human{
    @Override
    public void eat() {

    }

    public abstract void teach();

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher() {
    }
}
