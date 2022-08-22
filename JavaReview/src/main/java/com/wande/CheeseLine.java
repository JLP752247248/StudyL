package com.wande;

import java.util.concurrent.Callable;

/**
 * 奶酪车间
 */
public class CheeseLine implements Callable<Integer> {
    private int finished;
    private int aim;
    private MilkLine milkLine;
    private FaJiaoJiLine faJiaoJiLine;
    private ColdResponsitory resp;
    public CheeseLine(int aim,MilkLine milkLine,FaJiaoJiLine faJiaoJiLine,ColdResponsitory responsitory){
        this.aim=aim;
        this.milkLine=milkLine;
        this.faJiaoJiLine=faJiaoJiLine;
        this.resp=responsitory;
    }

    public void produceCheese(){
        milkLine.produce();
        faJiaoJiLine.produce();
        finished++;
    }

    @Override
    public Integer call() throws InterruptedException {
        System.out.println("开始生产奶酪...目前总共已生产数量："+finished+",目标数量："+aim);
        while(finished<aim){
            produceCheese();
            resp.getResQueue().put(new Integer(1));
            if(finished % 1000 ==0){
                System.out.println("生产奶酪中...目前总共已生产数量："+finished);
            }
        }
        System.out.println("开始生产奶酪...目前总共已生产数量："+finished);
        return finished;
    }
}

/**
 * 牛奶生产线
 */
class MilkLine {
    private int finished;
    private int aim;
    MilkLine(int aim){
        this.aim=aim;
    }

    public void produce() {
        finished+=2;
    }
}

/**
 * 发酵剂生产类
 */
class FaJiaoJiLine {

    private int finished;
    private int aim;
    FaJiaoJiLine(int aim){
        this.aim=aim;
    }

    public void produce() {
        finished++;
    }
}

