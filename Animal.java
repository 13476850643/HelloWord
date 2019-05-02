package com.kgc.day10;

public class Animal {

     String name;
     int age;
     char sex;

    public Animal() {
        System.out.println("父类的构造方法");
    }


    public int  run(){
        System.out.println("我正在奔跑！");
        return 1;
    }
}
