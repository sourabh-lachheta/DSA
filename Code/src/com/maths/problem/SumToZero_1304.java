package com.maths.problem;

public class SumToZero_1304 {
    public static  int[] sumZero(int n) {

        int[] arr = new int[n];

        boolean key = true;
        int num = 1;

        for(int i = 0; i<n; i++){
            if(key){
                arr[i] = num;
                key = false;
            }else{
                arr[i] = -num;
                key = true;
                num++;
            }
        }

        if(n % 2 == 1){
            arr[n-1] = 0;
        }

        return arr;

    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(sumZero(n));
    }
}
