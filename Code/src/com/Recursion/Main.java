package com.Recursion;

public class Main {

    // How function call work-------------------
    /*static void message1(int n){
        System.out.println(n);
        message2(3);
    }
    static void message2(int n){
        System.out.println(n);
        message3(4);
    }
    static void message3(int n){
        System.out.println(n);
    }*/


    // recursion---------------------------------
    static void message(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        message(n+1);
    }


    public static void main(String[] args){
        message(1);

    }
}
