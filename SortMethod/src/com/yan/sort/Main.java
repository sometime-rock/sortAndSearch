package com.yan.sort;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;

public class Main {

    public static void main(String[] args) {
        System.out.println("sort method start");

        //冒泡排序
        int arr[] ={4,20,3,14,1,2,3,40,2};
        BubbleSort.bubbleSort(arr);

        int arr2[] ={4,20,3,14,1,2,3,40,2};
        BubbleSort.bubbleSortPlus(arr2);

        //选择排序
        int arr3[] ={4,20,3,14,1,2,3,40,2};
        ChooseSort.chooseSort(arr3);

        //直接插入排序
        int arr4[] ={4,20,3,14,1,2,3,40,2};
        InsertSort.insertSort(arr4);

        //归并排序
        int arr5[] ={4,20,3,14,1,2,3,40,2};
        MergeSort.mergeSort(arr5);

        //快速排序
        int arr6[] ={4,20,3,14,4,20,3,14,1,2,3,40,24,20,3,14,1,23,14,1,2,3,40,24,20,3,14,1,2,3,40,24,20,3,3,40,24,20,3,14,1,2,3,40,2,1,2,3,40,2};
        QuickSort.quickSort(arr6);

        //希尔排序
        int arr7[] ={1,2,50,20,3,4,20,3,14,4,20,3};
        ShellSort.shellSort(arr7);

        //折半查找算法 ,要求是一个有序的数组
        int arr8[] ={1,2,50,20,3,4,20,3,14,4,20,3};
        QuickSort.quickSort(arr8);
        BinarySearch.binarySearch(arr8,3);

    }
}
