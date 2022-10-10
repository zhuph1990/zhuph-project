package com.zph.javase.oop.inl.computer;


public class InterCpu implements CPU {

    @Override
    public String getBrand() {
        return "inter";
    }

    @Override
    public String getHZ() {
        return "2000";
    }
}
