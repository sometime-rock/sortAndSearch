package com.yan.sort.test;

public class QuickSortTest {

    public void quickSort(int[] arr,int L,int R){
        int l = L;
        int r = R;
        int mid = arr[(l+r)/2];
        while (l<r){
            while (arr[l]<arr[mid]){
                l++;
            }
            while (arr[l]>arr[mid]){
                r--;
            }
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        if (L<r){
            quickSort(arr,L,r);
        }
        if (l<R){
            quickSort(arr,l,R);
        }


    }

}
