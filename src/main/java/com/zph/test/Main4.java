package com.zph.test;

public class Main4 {

    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            System.out.println("--------" + i + "------");
        }

        Thread thread = new Thread();
        System.out.println(thread.getState());
        thread.run();
        System.out.println(thread.getState());
    }

}




