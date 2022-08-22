package com.wande;

import java.util.concurrent.*;

/**
 * 生产系统启动类
 */
public class WorkerSystemMain {
    /** 总共生产总目标 **/
    public static final int TOTALCHEESENUMS=100000;
    public static void main(String[] args) {

        //冷库
        ColdResponsitory coldResponsitory=ColdResponsitory.getInstance();
        //牛奶生产线
        MilkLine milkLine=new MilkLine(TOTALCHEESENUMS);
        //发酵剂生产线
        FaJiaoJiLine faJiaoJiLine=new FaJiaoJiLine(TOTALCHEESENUMS*2);
        //奶酪生产线
        CheeseLine cheeseLineThread=new CheeseLine(TOTALCHEESENUMS,milkLine,faJiaoJiLine,coldResponsitory);
        //运货车线程
        TransCar carThread=new TransCar(coldResponsitory,TOTALCHEESENUMS);
        //系统工作线程池
        ExecutorService es=Executors.newFixedThreadPool(2);
        //运货车线程开始工作
        Future<Integer> futureTaskConsume=es.submit(carThread);
        //生产线程开始工作
        Future<Integer> futureTaskProduce= es.submit(cheeseLineThread);
        try {
            //8小时后罢工
            int totalConsume=futureTaskConsume.get(8, TimeUnit.HOURS);
            int totalProduce=futureTaskProduce.get(8, TimeUnit.HOURS);
            System.out.println("今天生产系统任务完成，共送货"+totalConsume+",共生产："+totalProduce);
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("系统异常："+e.getMessage());
        }  catch (TimeoutException e) {
            System.out.println("系统超时："+e.getMessage());
        }finally {
            es.shutdown();
        }
    }
}
