package com.Recursion;

public class CheckSortedArray {
    static private  boolean solve(int[] arr, int index){

        if(index == arr.length-1){
            return true;
        }

        return arr[index] < arr[index+1] && solve(arr, index+1);

    }
    public static void main(String[] args){
        int[] arr = {1,2,9,4};
        System.out.println(solve(arr,0));



    }
}
