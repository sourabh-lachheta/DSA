package com.Array;

public class RemoveMinMax_2019 {

    private static int minimumDeletions(int[] nums) {
        int n = nums.length;

        int min = find_min(nums); // index of min
        int max = find_max(nums);// index of max

        System.out.println(min + " " + max);

        int mid = nums.length/2;

        if(max < mid && min < mid){
            if(max < min){
                return min+1;
            }else{
                return max+1;
            }
        }

        if(max > mid && min > mid){
            if(min > max){
                return n - max;
            }else{
                return n - min;
            }
        }

        if(max > min){
            return min + (n - max) + 1;
        }


        return max + (n - min) + 1;


    }

    private static int find_min(int[] nums){
        int min = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[min] > nums[i]){
                min = i;

            }
        }
        return min;
    }

    private static int find_max(int[] nums){
        int max = 0;


        for(int i = 0; i<nums.length; i++){
            if(nums[max] < nums[i]){
                max = i;

            }
        }
        return max;
    }


    public static void main(String[] args){

        int[] nums = {10,2,3,4,6,1,5};
        System.out.println(minimumDeletions(nums));


    }
}
