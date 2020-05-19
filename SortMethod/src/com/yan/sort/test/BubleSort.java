package com.yan.sort.test;


import java.util.Arrays;

public class BubleSort {

    public static void bubleSort(int[] array){
        int length = array.length;
        int temp = 0;
        boolean flag = true;
        for (int i=length-1; i>0 ;i--){
            for (int j = 0 ;j <i;j++){
                if (array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
                flag = false;
            }
            if (flag == true){
                break;
            }
        }
        System.out.println("buble sort bubbleSort after " + Arrays.toString(array));
    }

    public static void main(String[] args){
        System.out.println("sort method start");
        //冒泡排序
        int arr[] ={4,20,3,14,1,2,3,40,2};
        bubleSort(arr);
    }

}
