package com.jlp.leetcode.sort;

import java.util.Arrays;

public class CombineSort {
    public static void sort(int[] arr) {
        sort(0, arr.length - 1, arr);

    }

    public static void sort(int start, int end, int[] arr) {
        if (end - start < 1) {
            return;
        }
        //将数组一分为二，极端可能为2个容量为1的数组
        int midIdx = start + (end - start) / 2;
        sort(start, midIdx, arr);
        sort(midIdx + 1, end, arr);
        int i = start;
        int j = midIdx + 1;
        int[] tempArr = new int[end - start + 1];
        int k = 0;
        while (i <= midIdx || j <= end) {
            if (j <= end && (i > midIdx || arr[i] >= arr[j])) {
                tempArr[k++] = arr[j++];
            } else {
                tempArr[k++] = arr[i++];
            }

        }
        System.arraycopy(tempArr, 0, arr, start, tempArr.length);
    }


    public static void main(String[] args) {
        int[] testArr = new int[] {11, 8};
        int[] testArr1 = new int[] {8, 10, 20, 3};
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
