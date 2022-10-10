package com.zph.javase.oop.inl.computer;


public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        CPU cpu = new InterCpu();
        HardDisk hardDisk =  new JSDHardDisk();
        computer.show(cpu,hardDisk);
    }
}
