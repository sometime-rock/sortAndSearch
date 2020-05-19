package com.yan.sort.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数相加
 */
public class ArraySum {
    public static int[] twoSum(int[] nums ,int target){
        //通过一个map 来存储key 为数组的每个数
        Map<Integer,Integer> numStorage = new HashMap<>();
        int length = nums.length;
        for (int i =0 ;i< length; i++){
            numStorage.put(nums[i],i);
        }
        for (int i = 0;i< length;i++){
            int tag = target-nums[i];
            if (numStorage.containsKey(tag)&& numStorage.get(tag) != i ){
                return new int[]{i,numStorage.get(tag)};
            }
        }
        return null;
    }

    public static void main(String[] args){
        int array[] = {2,7,11,15};
        int sum[] = twoSum(array,9);
        System.out.println("array == " + sum.toString());
    }
}
