package com.wande;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 冷库
 */
public class ColdResponsitory {
    /** 最大容量 **/
    public static final int MAX_CAPCITY=1000;

    /**阻塞队列**/
    private ArrayBlockingQueue<Integer> resQueue =new ArrayBlockingQueue<>(MAX_CAPCITY);

    /** 冷库**/
    private static ColdResponsitory instance;

    private ColdResponsitory(){

    }

    /**
     * 获取单例
     * @return
     */
    public static ColdResponsitory getInstance(){
        if(null ==instance ){
            synchronized (ColdResponsitory.class){
                if(null ==instance ){
                    instance=new ColdResponsitory();
                }
            }
        }
        return  instance;
    }

    /**
     * 获取当前剩余容量，同一时间只有一个线程能获得锁
     * @return
     */
    public synchronized ArrayBlockingQueue<Integer>  getResQueue(){
        return  resQueue;
    }
}
