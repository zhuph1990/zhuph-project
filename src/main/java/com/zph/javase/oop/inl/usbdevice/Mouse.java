package com.zph.javase.oop.inl.usbdevice;


public class Mouse implements UsbInterface {
    @Override
    public void dataTransfer() {
        System.out.println("鼠标来点击屏幕");
    }

    @Override
    public void play() {
        System.out.println("鼠标在自己玩");
    }
}
