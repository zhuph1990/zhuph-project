package com.zph.javase.basis;

public class Z19_RecursionDemo {

    public static void main(String[] args) {
        long d1 = System.currentTimeMillis();
        System.out.println("阶乘的结果: " + factorial(10));
        long d2 = System.currentTimeMillis();
        System.out.println("递归费时： " + (d2 - d1));
        //耗时：32ms
    }

    static long factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
