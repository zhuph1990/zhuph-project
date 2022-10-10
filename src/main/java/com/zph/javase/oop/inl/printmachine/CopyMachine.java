package com.zph.javase.oop.inl.printmachine;


public class CopyMachine implements InkBox, Paper {

    @Override
    public void getWriteAndBlock() {
        System.out.println("使用黑白墨盒打印");
    }

    @Override
    public void getColor() {
        System.out.println("使用彩色墨盒打印");
    }

    @Override
    public void getA4() {
        System.out.println("使用A4纸打印");
    }

    @Override
    public void getB5() {
        System.out.println("使用B5纸打印");
    }

    public static void main(String[] args) {
        CopyMachine copyMachine = new CopyMachine();
        copyMachine.getWriteAndBlock();
        copyMachine.getA4();
    }
}
