package com.yan.sort.test;

public class InsertSort {

    public void insertSort(int[] arr){
        int length = arr.length;
        int value;
        int position;
        for (int i = 1;i<length;i++){
            value = arr[i];
            position = i;
            while (position>0 && arr[position-1]>value){
                arr[position] = arr[position-1];
                position--;
            }
            arr[position] = value;
        }

    }
}
