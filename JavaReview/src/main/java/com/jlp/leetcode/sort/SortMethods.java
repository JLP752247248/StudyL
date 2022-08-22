package com.jlp.leetcode.sort;

import java.util.Arrays;

public class SortMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []needSortArr=new int [] {1,2,30,18,99,20,33,4,5,5,88,3,2};
		System.out.println(Arrays.toString(needSortArr));
		System.out.println(Arrays.toString(bubbleSort(Arrays.copyOf(needSortArr, needSortArr.length))));
		System.out.println(Arrays.toString(selectionSort(Arrays.copyOf(needSortArr, needSortArr.length))));
		System.out.println(Arrays.toString(insertionSort(Arrays.copyOf(needSortArr, needSortArr.length))));
		System.out.println(Arrays.toString(shellInsertionSort(Arrays.copyOf(needSortArr, needSortArr.length))));
		System.out.println(Arrays.toString(mergeSort(Arrays.copyOf(needSortArr, needSortArr.length))));
	}
	
	
	public static void swapArr(int [] arr,int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	/**
	 * 冒泡排序
	 * @param arraim
	 * @return
	 */
	public static int [] bubbleSort(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					swapArr(arr,j,j+1);
				}
			}
		}
		return arr;
	}

	/**
	 * 选择排序
	 * @param arraim
	 * @return
	 */
	public static int [] selectionSort(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			int minest=i;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<arr[minest]) {
					minest=j;
				}
			}
			swapArr(arr,i,minest);
		}
		return arr;
	}
	
	/**
	 * 插入排序
	 * @param arr
	 * @return
	 */
	public static int[] insertionSort(int [] arr) {
		for(int i=0;i<arr.length-1;i+=1) {
			int next=arr[i+1];
			int j=i;
			while(j>0) {//--要小心用啊
				if(next<arr[j]) {
					arr[j+1]=arr[j];
					if(j==0  || next>=arr[j-1]) {
						arr[j]=next;
						break;
					}
				}
				j--;
			}
		}
		return arr;
	}
	
	
	/**
	 * 希尔排序（是简单插入排序的改进版。它与插入排序的不同之处在于，它会优先比较距离较远的元素。希尔排序又叫缩小增量排序）
	 * @param arr
	 * @return
	 */
	public static int[] shellInsertionSort(int [] arr) {
		int len=arr.length;
		int div=len,i=0;
		while((div=div/2)>=1) {
			for(int k=0;k<len-div;k++) {
				int next=arr[k+div];
				int j=k;
				while(j>0) {
					if(next<arr[j]) {
						arr[j+div]=arr[j];
						if(j-div<=0  || next>=arr[j-div]) {
							arr[j]=next;

						}
					}
					j-=div;
				}
			}
		}
		return arr;
	}
	
	/**
	 * 归并排序
	 * @param arr
	 * @return
	 */
	public static int[] mergeSort(int [] arr) {
		return mergeSortDiv(arr,0,arr.length-1);
	}
	
	/**
	 * 归并排序
	 * @param arr
	 * @return
	 */
	private static int[] mergeSortDiv(int [] arr,int start,int end) {
		if(end-start<=0) {
			return arr;
		}
		//中间下标
		int midIdx=start+(end-start+1)/2-1;
		mergeSortDiv(arr,start,midIdx);
		mergeSortDiv(arr,midIdx+1,end);
		int i=start,j=midIdx+1;
		while(i<j && j<=end) {
			if(arr[i]>arr[j]) {
				int temp=arr[j];
				for(int k=j;k>i;k--) {
					arr[k]=arr[k-1];
				}
				arr[i]=temp;
				j++;
			}
			
			i++;
		}
		
		return arr;
	}
	
	
}
