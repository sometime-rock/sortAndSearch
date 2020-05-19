package com.yan.sort.test;

import java.util.Arrays;

public class ChooseSort {

    public static void chooseSort(int[] arr){
        int length = arr.length;
        int min = 0;
        int temp = 0;
        for (int i = 0;i<length-1;i++){
            for (int j = i+1;j <length;j++){
                if (arr[j]< arr[min]){
                    min = j;
                }
            }
            if (min!=i){
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }

        }
        System.out.println("chooseSort sort bubbleSort after " + Arrays.toString(arr));

    }

    public static void main(String[] args){
        System.out.println("sort method start");
        //冒泡排序
        int arr[] ={4,20,3,14,1,2,3,40,2};
        chooseSort(arr);
    }

}
