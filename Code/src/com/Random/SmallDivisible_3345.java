package com.Random;

public class SmallDivisible_3345 {
    static int smallestNumber(int n, int t) {
        return solve(n,t,n);

    }
    static int solve(int n, int t, int num){
        if(num > n+10){
            return -1;
        }
        int p = num;
        int ans = 1;
        while(p>0){
            System.out.println("p" +p);
            int a = p%10;
            System.out.println("a"+a);
            ans = ans * a;
            p = p/10;
        }
        System.out.println(ans);
        if(num >= n && ans%t==0){
            System.out.println("num"+num);
            return num;
        }
            return solve(n,t,num+1);


    }



    public static void main(String[] args){
        int n = 15;
        int t = 3;
        System.out.println(smallestNumber(n,t));
    }
}
