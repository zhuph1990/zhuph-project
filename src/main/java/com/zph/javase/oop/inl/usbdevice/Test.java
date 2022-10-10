package com.zph.javase.oop.inl.usbdevice;


public class Test {
    public static void main(String[] args) {

        UsbInterface usbInterface = new UDisk();
        usbInterface.dataTransfer();

        Mouse mouse = new Mouse();
        mouse.dataTransfer();

        UDisk up = new UDisk();
        up.dataTransfer();
    }
}
