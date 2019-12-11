package com.yan.sort;

/**
 * 归并排序
 * 归并排序是建立在归并操作上的一种有效的排序算法。
 * 该算法是采用分治法的一个非常典型的应用。将已有序的子序列合并，得到完全有序的序列；
 * 即先使每个子序列有序，再使子序列段间有序。若将两个有序表合并成一个有序表，称为2-路归并。
 * 总结
 * 归并排序在数据量比较大的时候也有较为出色的表现（效率上），但是，其空间复杂度O(n)使得在数据量特别大的时候（例如，1千万数据）几乎不可接受。
 * 而且，考虑到有的机器内存本身就比较小，因此，采用归并排序一定要注意。
 *
 */
public class MergeSort {

    public static void mergeSort(int[] arr){
        int[] temp =new int[arr.length];
        internalMergeSort(arr, temp, 0, arr.length-1);
    }
    private static void internalMergeSort(int[] arr, int[] temp, int left, int right){
        //当left==right的时，已经不需要再划分了
        if (left<right){
            int middle = (left+right)/2;
            internalMergeSort(arr, temp, left, middle);          //左子数组
            internalMergeSort(arr, temp, middle+1, right);       //右子数组
            mergeSortedArray(arr, temp, left, middle, right);    //合并两个子数组
        }
    }
    // 合并两个有序子序列
    private static void mergeSortedArray(int arr[], int temp[], int left, int middle, int right){
        int i=left;
        int j=middle+1;
        int k=0;
        while (i<=middle && j<=right){
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        while (i <=middle){
            temp[k++] = arr[i++];
        }
        while ( j<=right){
            temp[k++] = arr[j++];
        }
        //把数据复制回原数组
        for (i=0; i<k; ++i){
            arr[left+i] = temp[i];
        }
    }
}
