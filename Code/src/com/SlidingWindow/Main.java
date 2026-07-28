package com.SlidingWindow;

public class Main {

    static void Sliding_Window(int[] nums, int windowsize){
        int sum = 0;
        for(int i = 0; i<windowsize; i++){
            sum = sum + nums[i];

        }
        System.out.println("sum = " + sum);
        for(int i = 1; i <= nums.length-windowsize; i++){
            sum = sum - nums[i-1] + nums[i + windowsize-1];
            System.out.println("index "+ i + " + " + (i+1)+ "+ "+ (i+2) + "+ "   + sum);
        }

    }
    public static void main(String[] args){
        int[] nums = {3,4,5,6,3,2};
        int windowSize = 3;
        Sliding_Window(nums, windowSize);
    }
}
