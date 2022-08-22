package com.jlp.leetcode.sort;

import java.util.Arrays;

public class BaseNumSort {
    public static void sort(int[] arr) {
        int temp = arr[0];
        //第一步，找出最大数，判断最大位数
        for (int i = 1; i < arr.length; i++) {
            temp = (arr[i] < temp) ? temp : arr[i];
        }
        int bitLen = 1;
        while ((temp = temp / 10) > 0) {
            bitLen++;
        }

        //从个位开始，按照不同的位数排序
        for (int bit = 1; bit <= bitLen; bit++) {
            sortByBit(arr, bit);
        }

    }

    private static void sortByBit(int[] arr, int bit) {
        int[][] bitSlot = new int[10][arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            int powV = (int) Math.pow(10, bit - 1);
            int bitIdx = arr[i] / (powV) % 10;
            int slotIdx = bitSlot[bitIdx][arr.length];
            bitSlot[bitIdx][slotIdx] = arr[i];
            //槽内下表加1
            bitSlot[bitIdx][arr.length] = bitSlot[bitIdx][arr.length] + 1;
        }
        int k = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < bitSlot[i][arr.length]; j++) {
                arr[k++] = bitSlot[i][j];
            }
        }
    }

    private static void swap(int i, int i1, int[] arr) {
        int temp = arr[i1];
        arr[i1] = arr[i];
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
