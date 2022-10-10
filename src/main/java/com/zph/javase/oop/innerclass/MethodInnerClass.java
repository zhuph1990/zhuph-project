package com.zph.javase.oop.innerclass;


public class MethodInnerClass {

    public void show(int number){
        System.out.println("show");

        class InnerClass{
            private String name;
            public void test(int a){
                System.out.println("test");
                System.out.println(a);
                System.out.println(number);
            }
        }

        new InnerClass().test(12);
    }

    public static void main(String[] args) {
        MethodInnerClass  methodInnerClass = new MethodInnerClass();
        methodInnerClass.show(1234);

    }
}
