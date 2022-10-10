package com.zph.javase.oop.inl.usbdevice;


public class UDisk implements UsbInterface {
    @Override
    public void dataTransfer() {
        System.out.println("连接USB口，开始传输数据。");
    }

    @Override
    public void play() {

    }
}
