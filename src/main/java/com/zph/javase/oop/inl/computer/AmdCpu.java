package com.zph.javase.oop.inl.computer;


public class AmdCpu implements CPU {


    @Override
    public String getBrand() {
        return "amd";
    }

    @Override
    public String getHZ() {
        return "1000";
    }
}
