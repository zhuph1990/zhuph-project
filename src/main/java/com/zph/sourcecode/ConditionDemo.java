package com.zph.sourcecode;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Conditon中的await()对应Object的wait()；
 * Condition中的signal()对应Object的notify()；
 * Condition中的signalAll()对应Object的notifyAll()。
 */
public class ConditionDemo {

    private ReentrantLock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    private Condition condition2 = lock.newCondition();

    public static void main(String[] args) throws InterruptedException {

        ConditionDemo demo = new ConditionDemo();
        Thread thread = new Thread(() -> {
            while(true) {
                demo.rightFoot();
            }
        });

        Thread thread1 = new Thread(() -> {
            while(true) {
                demo.leftFoot();
            }
        });
        thread1.start();
        thread.start();

    }

    public void leftFoot(){
        try{
            lock.lock();
            Thread t = Thread.currentThread();
            String name = t.getName();
            //System.out.println(name+"获取了锁");
            // System.out.println(name+"等待右脚迈出");
            condition.await();
            Thread.sleep(500);
            System.out.println(name+"迈出左脚");
            Thread.sleep(500);
            condition2.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            lock.unlock();
            // System.out.println(Thread.currentThread().getName()+"释放了锁");
        }
    }

    public void rightFoot(){
        try{
            lock.lock();
            Thread t = Thread.currentThread();
            String name = t.getName();
            //System.out.println(name+"获取了锁");
            Thread.sleep(1000);
            condition.signal();
            System.out.println(name+"迈出右脚");
            Thread.sleep(500);
            //System.out.println(name+"等待左脚迈出");
            condition2.await();
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            lock.unlock();
            //System.out.println(Thread.currentThread().getName()+"释放了锁");
        }
    }

    private void startWalk(){
        try {
            lock.lock();
            condition2.signal();
            System.out.println("开始");
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }

}