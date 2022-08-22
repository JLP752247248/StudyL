package com.jlp.leetcode.sort;

import java.util.Arrays;

public class InsertSort {



    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            insertBySort(0,i,arr);
        }
    }

    public static void insertBySort(int start, int end, int[] arr) {
        for(int i=start;i<end;i++){
            int selectedValue = arr[end];
            if(selectedValue<arr[i]){
                addAndMoveAfter(i,end,arr);
            }
        }
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
