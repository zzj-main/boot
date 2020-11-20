package com.org.retrunvaltest.retrundemo;

public class CatUser {
    public void showCat(Cat c){
        c.eat();
    }

    public Cat getCat(){
        Cat c = new Cat();
        return c;
    }


}
