package com.zph.javase.oop.inl.doorlock;


import com.zph.javase.oop.inl.doorlock.Door;
import com.zph.javase.oop.inl.doorlock.DoorBell;
import com.zph.javase.oop.inl.doorlock.Lock;

public class LockDoor extends Door implements Lock, DoorBell {
    @Override
    public void openDoor() {
        System.out.println("开门");
    }

    @Override
    public void closeDoor() {
        System.out.println("关门");
    }

    @Override
    public void openLock() {
        System.out.println("开锁");
    }

    @Override
    public void closeLock() {
        System.out.println("关锁");
    }

    @Override
    public void photo() {
        System.out.println("拍照存档");
    }

}
