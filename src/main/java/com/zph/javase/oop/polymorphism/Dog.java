package com.zph.javase.oop.polymorphism;


public class Dog extends Pet {
    @Override
    public void feed() {
        System.out.println("狗在吃骨头");
    }
}
