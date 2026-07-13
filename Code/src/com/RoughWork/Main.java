package com.RoughWork;
import java.util.*;
public class Main {
    public static void main(String[] args){
        int low = 1000;
        int high = 13000;
        ArrayList<Integer> l = new ArrayList<>();
        int  n = 11;
        int ans = 12;
        int temp =100;
        int temp1 = 12;
       while(ans < 1200){
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

        System.out.println(l);

    }
}


