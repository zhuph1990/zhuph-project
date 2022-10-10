package com.zph.jdbc.reflect;

import com.zph.jdbc.entity.Emp;


public class CreateClassObject {
    public static void main(String[] args) throws Exception {
        //1、通过class.forname()来获取Class对象
        Class clazz1 = Class.forName("com.zph.jdbc.entity.Emp");
        //2、通过类名.class来获取 第三方包，需要将包引入到当前类中
        Class<Emp> clazz2 = Emp.class;
        //3、通过对象的getClass()来获取 重复产生Class对象
        Class clazz3 = new Emp().getClass();
        System.out.println(clazz3.getPackage());
        System.out.println(clazz3.getName());
        System.out.println(clazz3.getSimpleName());
        System.out.println(clazz3.getCanonicalName());

        //4、如果是一个基本数据类型，那么可以通过Type的方式来获取Class对象
        Class type = Integer.TYPE;
        System.out.println(type.getName());
        System.out.println(type.getCanonicalName());

    }
}
