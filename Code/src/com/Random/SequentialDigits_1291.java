

// LeetCode 1291 : Sequential Digit

package com.Random;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits_1291 {

    public static List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> l = new ArrayList<>();
        int  n = 11;
        int ans = 12;
        int temp =100;
        int temp1 = 12;
        int temp2 = low;
        while(ans < 23456789){
            if(temp2 <= 12 && high > 12){
                l.add(12);
                temp2 = 13;
            }
            ans = ans + n;
            int a = ans%10;
            if(ans >= low && ans <= high) {
                l.add(ans);
            }
            if(a == 9){
                //  int temp = 100;
                n = n + temp;
                ans = temp1 + n;
                if(ans >= low && ans <= high) {
                    l.add(ans);
                }
                temp1 = ans;
                temp = temp*10;
            }
        }
        return l;
    }
    public static void main(String[] args){
        int low = 1000;
        int high = 13000;
        System.out.println(sequentialDigits(low,high));

    }
}
