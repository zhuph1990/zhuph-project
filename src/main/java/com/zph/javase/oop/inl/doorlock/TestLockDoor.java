package com.zph.javase.oop.inl.doorlock;


import com.zph.javase.oop.inl.doorlock.LockDoor;

/*
* java中的继承关系是单继承，如果拥有多个父类的时候，可以考虑使用接口进行实现
*       java中的接口具备广泛的使用：
*       用法：
*           使用interface来修饰
*           接口中可以包含多个方法，且方法跟抽象类中的抽象方法一致，可以不写实现，子类在实现的时候必须要实现代码逻辑
*           子类实现接口使用implements关键字
*       特征：
*           1、接口中的所有方法都是抽象方法，不能包含方法的实现
*           2、接口中的所有方法的访问修饰权限都是public，不写并不是默认访问权限，而是public
*           3、接口不能被实例化
*           4、接口的子类必须要实现接口中的所有方法，跟抽象类有所不同，抽象类中的抽象方法必须要被子类实现
*           5、子类可以拥有实现多个接口
*           6、接口中的变量都是静态常量,如果变量没有使用static关键字修饰，它也表示静态常量,不用final关键字修饰，也是常量
*           7、接口中的方法和常量无论是否添加public修饰，默认的权限有且仅有一个，就是public
*
*      接口的使用：
*           1、接口代表一种能力，接口中可以定义N多个方法，子类在进行实现的时候，必须要实现这些方法
*               将这些方法进行实现，就意味着具体了方法的能力
*               关心实现类有何能力，而不关心实现细节
*
*      抽象类和接口的区别：
*           1、抽象类中的方法可以有抽象方法，也可以有普通方法，但是接口中只能包含抽象方法
*           2、抽象类需要使用abstract关键字来修饰，而接受使用interface关键字来修饰
*           3、子类使用extends关键字来继承抽象类，使用implements来实现接口
*           4、子类继承抽象类的时候必须要实现所有的抽象方法，普通方法可以不重写，而接口中的所有方法必须实现
*           5、抽象类中可以定义成员变量，而接口中只能定义静态常量
*           6、抽象类在子类实现的时候是单继承，而接口时多继承
*           7、抽象类和接口都不能实例化，但是抽象类中可以有构造方法，而接口中不能有构造方法
*           8、抽象类中可以实现接口，并且不实现接口中方法，而接口只能继承接口，不能实现接口
*       注意：
*           在实际的项目开发过程中，如果可以使用接口，尽量使用接口，将单继承的父类留在最关键的地方
 * */
public class TestLockDoor {
    public static void main(String[] args) {
        LockDoor lockDoor = new LockDoor();
//        Lock lock = new Lock();
        lockDoor.openDoor();
        lockDoor.openLock();
        lockDoor.closeDoor();
        lockDoor.closeLock();
        lockDoor.photo();
        System.out.println(LockDoor.a);
//        LockDoor.a = 300;
    }
}
