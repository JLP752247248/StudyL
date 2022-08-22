package com.jlp.javareview.multithreads;

import org.junit.Test;

import java.util.Random;
import java.util.concurrent.*;

public class ExecutorsTest {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore=new Semaphore(1);

        Callable<String> callable=new Callable<String>() {
            @Override
            public String call() throws Exception {
                semaphore.acquire();
                System.out.println("11");
                Thread.sleep(3000);
                System.out.println("12");
                semaphore.release();
                return new StringBuilder().append(Thread.currentThread().getId()).append("    ").append(new Random().nextInt()).toString();
            }
        };
        Callable<String> callable1=new Callable<String>() {
            @Override
            public String call() throws Exception {
                semaphore.acquire();
                System.out.println("2");
                semaphore.release();
                return new StringBuilder().append(Thread.currentThread().getId()).append("    ").append(new Random().nextInt()).toString();
            }
        };
        Runnable runnable=new Runnable() {
            @Override
            public void run() {

                System.out.println("333");
            }
        };
        ExecutorService es= Executors.newFixedThreadPool(10);


        es.submit(callable1);
        es.submit(callable);
        es.shutdown();
    }
    @Test
    /**
     * Junit多线程情况会有问题，
     */
    public void testFeature() throws ExecutionException, InterruptedException {
        Callable<String> callable=new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("11");
                Thread.sleep(3000);
                System.out.println("12");
                return new StringBuilder().append(Thread.currentThread().getId()).append("    ").append(new Random().nextInt()).toString();
            }
        };
        Callable<String> callable1=new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("2");
                return new StringBuilder().append(Thread.currentThread().getId()).append("    ").append(new Random().nextInt()).toString();
            }
        };
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("333");
            }
        };
        ExecutorService es= Executors.newFixedThreadPool(10);
        //es.submit(callable);
        //es.submit(callable1);
        //es.execute(runnable);
        //es.shutdown();
        //Thread.sleep(3000);
            new Thread(runnable).start();
        Thread.sleep(3000);

    }

}
