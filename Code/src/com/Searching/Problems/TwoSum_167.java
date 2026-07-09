

// LeetCode 167 =  Two Sum II - Input Array Is Sorted

package com.Searching.Problems;
import java.util.Arrays;
public class TwoSum_167 {
    public static int[] twoSum(int[] numbers, int target) {
        for(int i = 1; i < numbers.length; i++) {
            int a = target - numbers[i];  // it gives 9 - 2 = 7; now we have to check 7 exist or not
            int start = i + 1;
            int end = numbers.length - 1;

            while (start <= end) { // binary search start
                int mid = start + (end - start) / 2;
                if (numbers[mid] == a) {
                    return new int[]{i + 1, mid + 1};
                }
                if (numbers[mid] > a) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
       return new int[]{-1,-1};
    }
    public static void main(String[] args){
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));

    }
}



