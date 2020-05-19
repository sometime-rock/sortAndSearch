package com.yan.sort;

import java.util.Arrays;

/**
 * 快速排序
 * 快速排序是一个知名度极高的排序算法，其对于大数据的优秀排序性能和相同复杂度算法中相对简单的实现使它注定得到比其他算法更多的宠爱。
 * 算法描述
 * 从数列中挑出一个元素，称为"基准"（pivot），
 * 重新排序数列，所有比基准值小的元素摆放在基准前面，所有比基准值大的元素摆在基准后面（相同的数可以到任何一边）。在这个分区结束之后，该基准就处于数列的中间位置。这个称为分区（partition）操作。
 * 递归地（recursively）把小于基准值元素的子数列和大于基准值元素的子数列排序。
 * 稳定性
 * 快速排序并不是稳定的。这是因为我们无法保证相等的数据按顺序被扫描到和按顺序存放。
 * 适用场景
 * 快速排序在大多数情况下都是适用的，尤其在数据量大的时候性能优越性更加明显。但是在必要的时候，需要考虑下优化以提高其在最坏情况下的性能。
 */
public class QuickSort {

    public static void quickSort(int[] arr) {
        System.out.println("quickSort before " + Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("quickSort after " + Arrays.toString(arr));
    }

    private static void quickSort(int[] arr,int low,int high){
        int p,i,j,temp;
        if (low > high){
            return;
        }
        //设置基准值
        p = arr[(low+high)/2];
        //设置低位
        i = low;
        //设置低位
        j = high;
        while (i<j){
            //先从右边开始往左走，遇到比基准小的则停止
            while (i<j && arr[j] >= p){
                j--;
            }
            //先从左边开始往右走，遇到比基准大的则停止
            while (i<j && arr[i] <= p){
                i++;
            }
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        //这里的arr[i]一定是停小于p的，经过i、j交换后i处的值一定是小于p的(j先走)
        arr[low] = arr[i];
        arr[i] = p;
        //对左边快排
        quickSort(arr,low,i-1);
        //对右边快排
        quickSort(arr,i+1,high);
    }


}
