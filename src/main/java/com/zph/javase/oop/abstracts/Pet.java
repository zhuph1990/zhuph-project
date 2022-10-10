package com.zph.javase.oop.abstracts;


public abstract class Pet {

    private String name;
    private int age;

    public abstract void print();

    public void play(){
        System.out.println("play....");
    }

}
