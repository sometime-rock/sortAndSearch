package com.yan.sort;

import java.util.Arrays;

/**
 * 选择排序 选择排序是一种简单直观的排序算法，它也是一种交换排序算法，和冒泡排序有一定的相似度，可以认为选择排序是冒泡排序的一种改进。
 *   算法描述
 *   在未排序序列中找到最小（大）元素，存放到排序序列的起始位置
 *   从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 *   重复第二步，直到所有元素均排序完毕。
 *  总结
 *  稳定性：
 *  用数组实现的选择排序是不稳定的，用链表实现的选择排序是稳定的。
 *  不过，一般提到排序算法时，大家往往会默认是数组实现，所以选择排序是不稳定的
 *  使用场景：
 *  选择排序实现也比较简单，并且由于在各种情况下复杂度波动小，因此一般是优于冒泡排序的。
 *  在所有的完全交换排序中，选择排序也是比较不错的一种算法。但是，由于固有的O(n2)复杂度，
 *  选择排序在海量数据面前显得力不从心。因此，它适用于简单数据排序。
 */
public class ChooseSort {

    public static void chooseSort(int[] arr){
        System.out.println("chooseSort chooseSort before " + Arrays.toString(arr));
        //用于存放交换的临时变量
        int temp;
        int min ;
        for(int i = 0; i<arr.length-1; i++){
            //用于记录最小值的坐标值
              min = i;
              for (int j = i+1;j < arr.length; j++){
                  //一次循环后先找到比他小的最小值的坐标
                  if (arr[min]>arr[j]){
                      min = j ;
                  }
              }
            //拿当前最小值跟这个坐标值交换
            if (min!=i){
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.println("chooseSort chooseSort after " + Arrays.toString(arr));
    }

}
