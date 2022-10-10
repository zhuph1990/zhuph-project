package com.zph.javase.oop.innerclass;


public class AnonymousInnerClassDemo {

    public static void main(String[] args) {
        System.out.println("有一万行代码0");
        new Thread(new Runnable() { // new了一个接口的实现类
            @Override
            public void run() {
            }
        });
        System.out.println("有一万行代码1");
    }

}

class Runner implements Runnable {
    @Override
    public void run() {
    }

}