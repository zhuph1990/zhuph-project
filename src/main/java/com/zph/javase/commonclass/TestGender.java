package com.zph.javase.commonclass;


public class TestGender {
    Gender gender = Gender.female;
    Gender gender2 = Gender.male;

    public static void main(String[] args) {
        EventEnum ee = EventEnum.LAUNCH;
        ee.show();
        String name = EventEnum.PAGEVIEW.name();
        System.out.println(name);
    }
}
