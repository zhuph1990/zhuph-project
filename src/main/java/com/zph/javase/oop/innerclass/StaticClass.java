package com.zph.javase.oop.innerclass;


public class StaticClass {

    private int id;

    public void test() {
        System.out.println("test");
    }

    static class InnerClass {
        private String name;

        public void show() {
            System.out.println("show");
        }

    }

    public static void main(String[] args) {
        // (StaticClass.InnerClass)表示一个类， new 类（）
        InnerClass innerClass = new InnerClass();

    }
}
