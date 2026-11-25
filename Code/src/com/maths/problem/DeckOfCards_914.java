package com.maths.problem;

public class DeckOfCards_914 {
    public static boolean hasGroupsSizeX(int[] deck) {


        int[] freq = new int[10000];
        for(int num : deck){
            freq[num]++;
        }

        int gcd = 0;
        for(int count : freq){
            if(count > 0){
                gcd = findgcd(gcd , count);
            }
        }
        return gcd >= 2;

    }



    public static int findgcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args){
        int[] deck = {1,2,3,4,4,3,2,1};
        System.out.println(hasGroupsSizeX(deck));
    }
}
