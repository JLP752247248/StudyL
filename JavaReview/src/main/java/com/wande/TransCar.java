package com.wande;

import java.util.concurrent.Callable;

/**
 * 运货车
 */
public class TransCar implements Callable<Integer> {
    private int maxAims;
    private int alreadyTransedNum=0;
    private int transBatchSize=100;
    private ColdResponsitory coldResponsitory;
    public TransCar(ColdResponsitory coldResponsitory,int maxAims) {
        this.coldResponsitory=coldResponsitory;
        this.maxAims=maxAims;
    }

    @Override
    public Integer call() throws InterruptedException {
        int times=0;
        while(maxAims>alreadyTransedNum){
            System.out.println("开始往车内装货，已配送："+alreadyTransedNum+"，目标配送："+maxAims);
            int k=0;
            while(k++<transBatchSize ){
                //获取一条数据
                coldResponsitory.getResQueue().take();
                alreadyTransedNum++;
            }
            System.out.println("装满"+transBatchSize+"个奶酪...出发");
            Thread.sleep(2000);
            times++;
            System.out.println("本次配送完毕已返回，已配送次数："+times);
        }
        return alreadyTransedNum;
    }


}
