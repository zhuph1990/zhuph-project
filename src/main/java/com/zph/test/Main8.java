package com.zph.test;

/**
 * 循环打印ABC
 */
public class Main8 {

    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        while (i < 100) {

            printA();
            printB();
            printC();
            i++;
        }
    }

    public static void printA() throws InterruptedException {
        synchronized (Main8.class) {
            System.out.println("A");
            Thread.sleep(1000);
        }
    }

    public static void printB() throws InterruptedException {
        synchronized (Main8.class) {
            System.out.println("B");
            Thread.sleep(1000);
        }
    }

    public static void printC() throws InterruptedException {
        synchronized (Main8.class) {
            System.out.println("C");
            Thread.sleep(1000);
        }
    }


}
