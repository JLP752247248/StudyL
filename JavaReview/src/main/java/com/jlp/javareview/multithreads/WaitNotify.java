package com.jlp.javareview.multithreads;

import java.util.concurrent.locks.ReentrantLock;

public class WaitNotify {
    public static void main(String[] args) {
        Object obj1=new Object();
        Object obj2=new Object();
        ReentrantLock lock=new ReentrantLock();

        Runnable r=new Runnable() {
            @Override
            public void run() {
                lock.lock();
                synchronized (obj2){
                    System.out.println(Thread.currentThread().getId()+"线程获得锁：");
                    try {
                        //obj2.wait();
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getId()+"线程释放锁：");
            }
        };

        Thread t1=new Thread(r);

        Thread t2=new Thread(r);

        t1.start();
        t2.start();
    }
}
