package com.Searching.BinearySearch;

public class Main {

     static int Search(int[] arr, int num){
         int start = 0;
         int end = arr.length - 1;
         while(start <= end){
             int mid = start + (end - start)/2;
             if (num == arr[mid]) {
                 return mid;
             }
             if(num > arr[mid]){
                 start = mid + 1;
             }
             else{
                 end = mid - 1;
             }
         }
         return -1;
     }
    public static void main(String[] args){
         int[] arr = {1,2,3,4,5,6};
         int num = 2;
         int ans = Search(arr, num);
        if(ans == -1){
            System.out.println("not found");
        }else{
            System.out.println(num + " at index : " + ans);
        }

    }
}
