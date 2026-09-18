package com.Random;

public class fico {

    public static void fico(int n){

        int f = 1;
        while(n != 0){
            f = f * n;
            n--;
        }

        System.out.println(f);
    }
    public static void main(String[] arg) {

        int n = 2;
        fico(n);

        }
    }
