package com.yan.sort;

import java.util.Arrays;

/**
 * 插入排序
 * 插入排序是一种简单直观的排序算法。它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 * 稳定性
 * 由于只需要找到不大于当前数的位置而并不需要交换，因此，直接插入排序是稳定的排序方法。
 * 适用场景
 * 插入排序由于O( n2 )的复杂度，在数组较大的时候不适用。但是，在数据比较少的时候，是一个不错的选择，一般做为快速排序的扩充。
 * 例如，在STL的sort算法和stdlib的qsort算法中，都将插入排序作为快速排序的补充，用于少量元素的排序。
 * 又如，在JDK 7 java.util.Arrays所用的sort方法的实现中，当待排数组长度小于47时，会使用插入排序。
 */
public class InsertSort {

    public static void insertSort(int[] arr){
        System.out.println("insertSort insertSort before " + Arrays.toString(arr));
        for (int i=1;i<arr.length;i++){
            System.out.println("insertSort insertSort i ==  " + i);
            int value = arr[i];
            int position = i;
            while ( position>0 && arr[position-1]>value){
                System.out.println("insertSort insertSort position ==  " + position);
                arr[position] = arr[position-1];
                position--;
            }
            arr[position] = value;
        }
        System.out.println("insertSort insertSort after " + Arrays.toString(arr));
    }

}
