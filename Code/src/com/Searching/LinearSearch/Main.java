package com.Searching.LinearSearch;

public class Main {

    public static int search(int[] arr, int num){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int num = 9;
        int ans = search(arr,num);
        if(ans == -1){
            System.out.println("not found");
        }
        else{
            System.out.println(num + " at index : " + ans);
        }


    }
}
