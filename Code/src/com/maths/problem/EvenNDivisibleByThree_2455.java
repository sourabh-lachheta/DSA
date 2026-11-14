package com.maths.problem;

public class EvenNDivisibleByThree_2455 {

    public static int averageValue(int[] nums) {

        int sum = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0 && nums[i] % 3 == 0){

                System.out.println(nums[i]);
                count++;
                sum = sum + nums[i];
            }
        }

        if(count == 0){
            return 0;
        }

        return sum/count;




    }
    public static void main(String[] args){

        int[] nums = {1,3,6,10,12,15};

        System.out.println(averageValue(nums));

    }
}
