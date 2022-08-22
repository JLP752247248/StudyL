package com.jlp.leetcode.sort;

/**
 * 1）完全二叉树，双亲节点和孩子节点的关系
 * array[0，...，n-1]表示完全二叉树顺序存储模式
 * 1.节点array[i] 的父节点为 i==0 ? null : array[i-1/2]
 * 2.节点array[i]的左孩子为，array[2*i + 1]
 * 3.节点array[i]的右孩子为，array[2*i + 2]
 * 2）堆在数组中的表示方式
 * 堆的逻辑结构是一颗完全二叉树，存储结构是一个数组。
 * 数组为完全二叉树的层次遍历的结果。
 * 3）大根堆和小根堆的定义
 * 前提0 <= i < (n-1)/2
 * 1.满足array[i] <= array[2i + 1] && array[i] <= array[2i + 2] 为小根堆。
 * 2.满足array[i] >= array[2i + 1] && array[i] >= array[2i + 2] 为大根堆。
 *
 */
public class TestArrBorderMain {
    public static void main(String[] args) {
        int[] arr = new int[] {10, 20, 2, 32, 33, 32, 11, 21, 90, 87, 76, 43, 22, 222};


    }

}
