package com.zph.test;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " --- " + new Date());
            Thread.sleep(1000);
        }
        System.out.println("cost time: " + (System.currentTimeMillis() - start) / 1000 + " s");
    }
}
