package com.jlp.leetcode.sort;

import java.util.Arrays;

public class SelectSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxIdx = chooseMin(i,arr.length-1,arr);
            addAndMoveAfter(i,maxIdx,arr);
        }
    }

    /**
     * 选取范围类的最大值，返回下标
     *
     * @param start
     * @param end
     * @param arr
     */
    public static int chooseMin(int start, int end, int[] arr) {
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[i]<= arr[max]){
                max = i;
            }
        }
        return max;
    }

    public static void addAndMoveAfter(int insertIdx, int sourceIdx, int[] arr) {
        int temp = arr[sourceIdx];
        for (int i = sourceIdx; i > insertIdx; i--) {
            arr[i] = arr[i-1];
        }
        arr[insertIdx] = temp;
    }


    public static void main(String[] args) {
        int[] testArr = new int[] {8, 10, 2, 3, 13, 11, 14};
        int[] testArr1 = new int[] {8, 10, 20, 3, 13, 11, 14};
        int[] testArr2 = new int[] {8, 8, 2, 3, 52, 11, 14};
        int[] testArr3 = new int[] {800, 10, 2, 3, 13, 9, 9,7};
        sort(testArr);
        sort(testArr1);
        sort(testArr2);
        sort(testArr3);

        System.out.println(Arrays.toString(testArr));
        System.out.println(Arrays.toString(testArr1));
        System.out.println(Arrays.toString(testArr2));
        System.out.println(Arrays.toString(testArr3));

    }
}
