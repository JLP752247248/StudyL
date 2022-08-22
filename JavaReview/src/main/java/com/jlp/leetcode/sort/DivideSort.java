package com.jlp.leetcode.sort;

import java.util.Arrays;

public class DivideSort {

    public static void sort(int[] arr) {
        divideSort(0, arr.length - 1, arr);
    }


    //取一个中间值
    public static void divideSort(int start, int end, int[] arr) {
        if (end - start < 1) {
            return;
        }
        //将数组一分为二，极端可能为2个容量为1的数组
        int midIdx = start + (end - start) / 2;
        int[] tempArr = new int[end - start + 1];
        int lk = 0;
        int bk = end - start;
        //遍历范围内，除了中间值以外的
        for (int idx = start; idx <= end; idx++) {
            if (idx == midIdx) {
                continue;
            }
            if (arr[idx] <= arr[midIdx]) {
                tempArr[lk++] = arr[idx];
            } else {
                tempArr[bk--] = arr[idx];
            }
        }
        if (bk < end) {
            tempArr[bk] = arr[midIdx];
            midIdx = bk + start;
        } else {
            tempArr[lk] = arr[midIdx];
            midIdx = lk + start;
        }
        System.arraycopy(tempArr, 0, arr, start, tempArr.length);
        divideSort(start, midIdx - 1, arr);
        divideSort(midIdx + 1, end, arr);
    }


    public static void main(String[] args) {
        int[] testArr = new int[] {14, 8};
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
