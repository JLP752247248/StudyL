package com.jlp.leetcode.sort;

import java.util.Arrays;

public class BubbleSort {



    public static void sort(int[] arr) {
        int rihtFlag = arr.length;
        for (int i = (arr.length - 1); i >= 0; i--) {
            if(i> rihtFlag){
                i= rihtFlag;
            }
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(j, j + 1, arr);
                    rihtFlag = j;
                }
            }
        }
    }

    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] testArr = new int[] {8, 10,2, 3,  13,11,  14};
        sort(testArr);
        System.out.println(Arrays.toString(testArr));

    }
}
