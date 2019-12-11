package com.yan.sort;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * 冒泡排序算法 4，10,1,5,7,2,1,3
     */
    public static void bubbleSort(int[] arr){
        int temp = 0;
        for (int i = arr.length-1;i > 0; i--){
            Log.i("buble sort " , "num" + i);
            for (int j =0;j<i;j++){
                if (arr[j]>arr[j+1]){
                    Log.i("buble sort " , "arr[j] :" + arr[j] +"arr[j+1] :"+arr[j+1]);
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}


