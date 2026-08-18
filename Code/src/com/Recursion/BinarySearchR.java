package com.Recursion;

public class BinarySearchR {

    private static int solve(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }

        int m = s + (e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if(arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return solve(arr, target, s,m-1);
            }else{
                return solve(arr, target, m+1, e);
            }
        }

        if(target >= arr[m] && target <= arr[e]){
            return solve(arr, target, m+1,e);
        }

        return solve(arr, target, s, m-1);
    }


    public static void main(String[] args){
        int[] arr = {5,6,7,1,9,2,3};
        System.out.println(solve(arr,2,0,arr.length-1));
    }
}
