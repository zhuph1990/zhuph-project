package com.zph.javase.oop.inl.usbdevice;


public class AAA implements UsbInterface {
    @Override
    public void dataTransfer() {
        System.out.println("AAA 进行数据传输");
    }

    @Override
    public void play() {

    }
}
