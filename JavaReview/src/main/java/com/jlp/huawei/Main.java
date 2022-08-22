package com.jlp.huawei;

import java.util.Scanner;








/**
 * 3,3
 * 1,2,3
 * 1,2,3
 * 1,2,3
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String head = sc.nextLine();
        String []headArr=head.split(" ");
        int steps=Integer.valueOf(headArr[0]);
        int end=Integer.valueOf(headArr[1]);

        int []stepArr= new int[steps];
        int []stepHeightArr= new int[steps];
        int totalMianJi=0;
        int tempX=0;
        int yActual=0;
        for(int i = 0; i < steps; i++){
            String points =sc.nextLine();
            String []tempArr=points.split(" ");
            stepArr[i]=Integer.valueOf(tempArr[0]);
            stepHeightArr[i]=Integer.valueOf(tempArr[1]);
            if(i>0){
                int addMianji=(stepArr[i]-tempX)*Math.abs(yActual);
                totalMianJi+=addMianji;
            }
            tempX=stepArr[i];
            yActual+=stepHeightArr[i];
        }


        int addMianjiLast=(end-tempX)*Math.abs(yActual);
        totalMianJi+=addMianjiLast;
        System.out.println(totalMianJi);
    }


}









/**
 * 3,3
 * 1,2,3
 * 1,2,3
 * 1,2,3
 *//*

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String head = sc.nextLine();
        String []headArr=head.split(",");
        int pinwei=Integer.valueOf(headArr[0]);
        int xuanshou=Integer.valueOf(headArr[1]);
        String[]points= new String[pinwei];
        int [][]pointsInt= new int[pinwei][xuanshou];
        int []totalPoits=new int[xuanshou];
        boolean valid=true;
        if(pinwei<3||pinwei>10 || xuanshou<3 || xuanshou>100){
            valid=false;
        }
        for(int i = 0; i < pinwei; i++){
            points[i] =sc.nextLine();
            String []tempArr=points[i].split(",");
            for(int k=0;k<tempArr.length;k++){
                pointsInt[i][k]=Integer.valueOf(tempArr[k]);
                if(pointsInt[i][k]>10 || pointsInt[i][k]<1){
                    valid=false;
                }else{
                    totalPoits[k]=totalPoits[k]+pointsInt[i][k];
                }
            }
        }

        if(valid){
            StringBuilder stringBuilder=new StringBuilder();
            stringBuilder.append(String.valueOf(findFirstScore(0,xuanshou,pointsInt,totalPoits))).append(",")
                    .append(String.valueOf(findFirstScore(1,xuanshou,pointsInt,totalPoits))).append(",")
                    .append(String.valueOf(findFirstScore(2,xuanshou,pointsInt,totalPoits)));
            System.out.println(stringBuilder.toString());
        }else{
            System.out.println(-1);
        }

    }

    //获取第index大的
    public static int findFirstScore(int index,int xuanshou,int [][]pointsInt,int []totalPoits){
        int idx=-1;
        Set<Integer> used=new HashSet<>();
        for(int j=0;j<=index;j++){
            idx=-1;
            for(int i=0;i<xuanshou;i++){
                if(idx==-1){
                    if(!used.contains(i)){
                        idx=i;
                    }
                    continue;
                }
                if(idx!=i && (!biggerThan(idx,i,pointsInt,totalPoits) ) && !used.contains(i) ){
                    idx=i;
                }
            }
            used.add(idx);
        }
        return idx+1;
    }

    //a的分数比b靠前
    public static boolean biggerThan(int aIndex,int bIndex,int [][]pointsInt,int []totalPoits){
        boolean res=true;
        if(totalPoits[aIndex]<totalPoits[bIndex]){
            res=false;
        }else if(totalPoits[aIndex]>totalPoits[bIndex]) {
            res=true;
        }

        else{
            boolean scopeSizeBigger=false;
            for(int i=10;i>0;i--){
                int aSize=0;
                int bSize=0;
                for(int k=0;k<pointsInt.length;k++){
                    if(pointsInt[k][aIndex]==i){
                        aSize++;
                    }
                    if(pointsInt[k][bIndex]==i){
                        bSize++;
                    }
                }
                if(aSize==bSize){
                   continue;
                }else{
                    return aSize>bSize;
                }

            }
            res=scopeSizeBigger;
        }
        return res ;
    }
}*/
