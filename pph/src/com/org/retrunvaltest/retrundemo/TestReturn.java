package com.org.retrunvaltest.retrundemo;

public class TestReturn {
    public static void main(String[] args) {
        CatUser cu = new CatUser();
        Cat c = new Cat();
        cu.showCat(c);

        Cat cat = cu.getCat();
        cat.eat();



    }
}
