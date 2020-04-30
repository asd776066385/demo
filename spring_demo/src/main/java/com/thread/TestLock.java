package com.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
    private static Lock lock = new ReentrantLock(true);

    public static void main(String[] args) {
        System.out.println("------begin-----------");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    System.out.println("******** 当前:" + Thread.currentThread().getName() + "开始执行 **********");
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                    System.out.println("******** 当前:" + Thread.currentThread().getName() + "结束执行 **********");
                }
            }
        }, "thread-A");


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    System.out.println("******** 当前:" + Thread.currentThread().getName() + "开始执行 **********");
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                    System.out.println("******** 当前:" + Thread.currentThread().getName() + "结束执行 **********");
                }
            }
        }, "thread-B");



        thread.start();
        thread1.start();
        System.out.println("------end-----------");
    }
}
