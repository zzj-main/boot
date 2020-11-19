package com.org.ooptest.oppdemo3;

public class TestOOP {
    /**
     多态的转型
     向上转型
        从子到父
            父类引用指向子类对象
     向下转型
         从父到子
            父类引用转为子类对象

     * @param args
     */

    //内存引用
    public static void main(String[] args) {
       Animal a = new Dog();//子类向上转型
        a.eat();
        Dog c = (Dog) a;//父类向下转型调用子类中的方法
        c.show();
//        a = new Cat();
//        a.eat();a
        //报错 java.lang.ClassCastException
//        Cat c1 = (Cat) a;
//        c1.eat();


    }

}
