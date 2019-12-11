package com.yan.sort;

import java.util.Arrays;

/**
 * 折半查找算法
 * 常用的算法有查找算法和排序算法。查找算法有线性查找算法、深度优先搜索算法、广度优先搜索算法和二分查找算法，而最常用也最快速的就是二分查找算法了。
 *
 * 二分查找算法又叫作折半查找，要求待查找的序列有序，每次查找都取中间位置的值与待查关键字进行比较，如果中间位置的值比待查关键字大，则在序列的左半部分继续执行该查找过程
 * ，如果中间位置的值比待查关键字小，则在序列的右半部分继续执行该查找过程，直到查找到关键字为止，否则在序列中没有待查关键字。
 */
public class BinarySearch {

    public static int binarySearch(int[] arr,int searchNum){
        System.out.println("binarySearch arr = " + Arrays.toString(arr));
        System.out.println("binarySearch searchNum = " + searchNum);
        int low = 0;
        int high = arr.length;
        int mid ;
        while (low<high){
            mid = (low+high)/2;
            if (searchNum == arr[mid]){
                System.out.println("binarySearch find now " + mid);
                return arr[mid];
            }else if(searchNum > arr[mid]){
                low = mid+1;
            }else if (searchNum < arr[mid]){
                high = mid - 1;
            }
        }
        return -1;
    }
}
