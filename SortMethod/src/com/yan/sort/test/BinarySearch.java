package com.yan.sort.test;

import java.util.Collections;

public class BinarySearch {

    public int binarySearch(int[] arr,int value){
        int left = 0;
        int right = arr.length;
        while (left<right){
            int mid = (left+right)/2;
            if (arr[mid] == value){
                return arr[mid];
            }else if (arr[mid]>value){
                right = mid -1;
            }else {
                left = mid + 1;
            }
        }
        return -1;
    }

}
