package com.maths.problem;

public class NimGame_292 {
    public static boolean canWinNim(int n) {

        if(n % 4 == 0){
            return false;
        }

        return true;

    }

    public static void main(String[] args){
        int n = 4;
        System.out.println(canWinNim(n));
    }
}
