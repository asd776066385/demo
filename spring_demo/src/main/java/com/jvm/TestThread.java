package com.jvm;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

public class TestThread {
    private static volatile int state = 0;
    private static ReentrantLock lock = new ReentrantLock();
    private static Thread thread1;
    private static Thread thread2;

    public static void print() {
        thread1 = new Thread(() -> {
            for (char i = 'A'; i < 'Z'; i++) {
                System.out.println(i);
                LockSupport.unpark(thread2);
                LockSupport.park();
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "打印字符");

        thread2 = new Thread(() -> {
            for (int i = 1; i < 26; i++) {
                LockSupport.park();
                System.out.println(i);
                LockSupport.unpark(thread1);
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "打印数字");

        thread1.start();
        thread2.start();
    }


    public static void main(String[] args) {
        //线程交替输出A1B2C3
        print();
    }
}
