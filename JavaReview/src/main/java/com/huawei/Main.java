package com.huawei;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Calculator ca=new Calculator();
        System.out.println(ca.calculate("120/2 + (20-(( 30 -100) -20)) +20 -(10-0)"));
    }
}
class Calculator {
    public int calculate(String inputStr){
        Deque<Character> operate=new ArrayDeque<>();
        Deque<Integer> nums=new ArrayDeque();
        char[] chas=inputStr.toCharArray();
        int i=0;
        while(i<chas.length){
            char temp=chas[i];
            if(' ' == temp){
                i++;
                continue;
            }
            if('('==temp){
                int lef=1;
                String child="";
                while(lef!=0 ){
                    char ctemp=chas[++i];
                    if(ctemp=='('){
                        lef++;
                    }else if(ctemp==')'){
                        lef--;
                    }
                    if(lef!=0){
                        child+=ctemp;
                    }
                }
                int reschild=calculate(child);
                if(operate.peekLast()!=null  && operate.peekLast() == '*'){
                    nums.addLast(nums.poll()*reschild);
                    operate.poll();
                }else if (operate.peekLast()!=null  && operate.peekLast() == '/'){
                    nums.addLast(nums.poll()/reschild);
                    operate.poll();
                }else{
                    nums.add(reschild);
                }
                continue;
            }else if( isNumber(temp)) {
                int tempInt=0;
                while(i<chas.length && isNumber(chas[i]) ){
                    tempInt = tempInt * 10 + Integer.valueOf(String.valueOf(chas[i]));
                    i++;
                }
                if(operate.peekLast()!=null  && operate.peekLast() == '*'){
                    nums.addLast(nums.poll()*tempInt);
                    operate.poll();
                }else if (operate.peekLast()!=null  && operate.peekLast() == '/'){
                    nums.addLast(nums.poll()/tempInt);
                    operate.poll();
                }else{
                    nums.add(tempInt);
                }
                continue;
            }else if(temp == '+'||temp == '-'|| temp == '*' || temp == '/') {
                operate.add(temp);
            }
            i++;
        }
        int resultInt=0;
        System.out.println(nums);
        System.out.println(operate);
        while(!operate.isEmpty() && !nums.isEmpty()){
            char opt=operate.pollFirst();
            if(opt=='+'){
                resultInt=nums.pollFirst()+nums.pollFirst();
            }else if('-'==opt){
                resultInt=nums.pollFirst()-nums.pollFirst();
            }
            nums.push(resultInt);
        }
        return nums.peek();
    }

    public boolean isNumber(char temp){
        return temp >='0' && temp <= '9';
    }
}