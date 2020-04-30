package com.jvm;

import java.util.concurrent.ThreadFactory;

public class TestThreadPool {

    public static void main(String[] args) {
        ThreadFactory threadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r, "线程池名称");
            }
        };
    }
}
