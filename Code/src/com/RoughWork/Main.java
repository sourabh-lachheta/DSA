package com.RoughWork;
import java.util.*;
public class Main {

    static int sort(int[] nums, int val){
       // Arrays.sort(nums);
        int n = nums.length;
        int k = 0;
        for(int i = nums.length-1; i >=0; i--){
            System.out.println("outer loop : " + Arrays.toString(nums));
            for(int j = i - 1; j >=0; j--){
                if(nums[j] == val){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for(int i = nums.length-1; i >=0; i--){
            if(nums[i] == 2){
                k++;
            }else{
                n = n - k;
                return n;
            }
        }
        return -1;

    }
    public static void main(String[] args){
       int[] nums= {3,2,2,3};

        System.out.println(sort(nums,3));

    }
}


