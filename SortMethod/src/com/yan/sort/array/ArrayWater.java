package com.yan.sort.array;

public class ArrayWater {

    public static int maxArea(int[] height){
        int left = 0;
        int right = height.length-1;
        int area = 0;
        int length = 0;
        while (left < right) {
            length = right - left;
            area = Math.max(area,Math.min(height[left],height[right]) * length );
            if (height[left]>height[right]){
                right = right - 1;
            }else {
                left = left + 1 ;
            }
        }
        return area;
    }

    public static void main(String args[]){
        int[] testArray = {1,8,6,2,5,4,8,3,7};
        maxArea(testArray);
    }
}
