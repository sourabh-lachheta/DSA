package com.maths.problem;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber_728 {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for(int i = left; i<=right; i++){
            if(solve(i) == true){
                list.add(i);
            }
        }
        return list;
    }

    public static boolean solve(int num){

        int n = num;
        while(n > 0){
            int a = n%10;

            if(a == 0){
                return false;
            }
            if(num%a != 0){
                return false;
            }
            n = n/10;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(selfDividingNumbers(1,22));
    }
}
