package com.yan.sort;

import java.util.Arrays;
/**
 * 冒泡排序算法 4，10,1,5,7,2,1,3
 * 冒泡排序思路简单，代码也简单，特别适合小数据的排序。但是，由于算法复杂度较高，在数据量大的时候不适合使用。
 * 在数据完全有序的时候展现出最优时间复杂度，为O(n)。其他情况下，几乎总是O( n2 )。因此，算法在数据基本有序的情况下，性能最好。
 *     算法描述：
 *     1.比较相邻的元素。如果第一个比第二个大，就交换它们两个；
 *     2.对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
 *     3.针对所有的元素重复以上的步骤，除了最后一个；
 *     重复步骤1~3，直到排序完成。
 *
 * 稳定性
 * 在相邻元素相等时，它们并不会交换位置，所以，冒泡排序是稳定排序。
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr){
        int temp = 0;
        System.out.println("buble sort bubbleSort before " + Arrays.toString(arr));
        for (int i = arr.length-1;i > 0; i--){
            System.out.println("buble sort " +"num " + i);
            for (int j =0;j<i;j++){
                if (arr[j]>arr[j+1]){
                    System.out.println("buble sort :" + "arr[j] :" + arr[j] +"arr[j+1] :"+arr[j+1]);
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("buble sort bubbleSort after " + Arrays.toString(arr));
    }

    //要使算法在最佳情况下有O(n)复杂度，需要做一些改进，增加一个swap的标志，当前一轮没有进行交换时，说明数组已经有序，没有必要再进行下一轮的循环了，直接退出。
    public static void bubbleSortPlus(int[] arr) {
        int temp = 0;
        boolean flag = false;
        System.out.println("buble sort bubbleSortPlus before " + Arrays.toString(arr));
        for (int i = arr.length-1;i > 0; i--){
            System.out.println("buble sort bubbleSortPlus" +"num " + i);
            for (int j =0;j<i;j++){
                if (arr[j]>arr[j+1]){
                    System.out.println("buble sort bubbleSortPlus :" + "arr[j] :" + arr[j] +"arr[j+1] :"+arr[j+1]);
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (flag == false){
                break;
            }
        }
        System.out.println("buble sort bubbleSortPlus after " + Arrays.toString(arr));
    }// method bubbleSort
}
