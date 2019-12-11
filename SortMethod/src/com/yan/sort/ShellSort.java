package com.yan.sort;

import java.util.Arrays;

/**
 * 希尔排序
 * 稳定性
 * 我们都知道插入排序是稳定算法。但是，Shell排序是一个多次插入的过程。
 * 在一次插入中我们能确保不移动相同元素的顺序，但在多次的插入中，相同元素完全有可能在不同的插入轮次被移动，
 * 最后稳定性被破坏，因此，Shell排序不是一个稳定的算法。
 * 适用场景
 * Shell排序虽然快，但是毕竟是插入排序，其数量级并没有后起之秀--快速排序O(n㏒n)快。在大量数据面前，Shell排序不是一个好的算法。但是，中小型规模的数据完全可以使用它。
 * 我们发现希尔排序代码其实非常简单(相比对堆排序)，理解起来也不难，就用增量来将数组进行分隔，直到增量为1。底层干的还是插入排序干的活～
 */
public class ShellSort {

    public static void shellSort(int[] arr){
        System.out.println("shellSort before " + Arrays.toString(arr));
        for(int step = arr.length/2;step>0;step=step/2){
            for (int i = step;i<arr.length;i++){
                int j = i;
                int temp = arr[j];
                while (j-step >= 0 && temp < arr[j-step]){
                    arr[j] = arr[j-step];
                    j = j - step;
                }
                arr[j] = temp;
            }

        }
        System.out.println("shellSort before " + Arrays.toString(arr));
    }
}