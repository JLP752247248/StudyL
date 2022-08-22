package com.jlp.leetcode.sort;

import java.util.Arrays;

public class HeapSort {
    public static void sort(int[] arr) {

        //第一步，初始化大顶堆,从最后一个非叶子节点开始
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            validBigTopHeap(i, arr, arr.length);
        }

        //第二步，首尾交换，然后从顶点刷新大顶堆
        for (int j = 1; j < arr.length; j++) {
            swap(0, arr.length - j, arr);
            validBigTopHeap(0, arr, arr.length - j);
        }

    }

    private static void swap(int i, int i1, int[] arr) {
        int temp = arr[i1];
        arr[i1] = arr[i];
        arr[i] = temp;
    }

    private static void validBigTopHeap(int start, int[] arr, int length) {
        int i = start;
        int temp = arr[i];
        //从当前节点开始，往下
        while (i <= (length / 2 - 1)) {
            int k = 2 * i + 1;
            if (k < length - 1 && arr[k] < arr[k + 1]) {
                k++;
            }
            if (temp < arr[k]) {
                arr[i] = arr[k];
                i = k;
            } else {
                break;
            }
        }
        arr[i] = temp;


    }


    public static void main(String[] args) {
        int[] testArr = new int[] {6, 10, 2, 3, 13, 9, 1, 7};
        int[] testArr1 = new int[] {8, 10, 20, 3, 13, 11, 14};
        int[] testArr2 = new int[] {8, 8, 2, 3, 52, 11, 14};
        int[] testArr3 = new int[] {800, 10, 2, 3, 13, 9, 9, 7};
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
