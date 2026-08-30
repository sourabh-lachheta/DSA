package com.RoughWork;

public class roughString {
    public static void main(String[] args){
        String s = "sourabh";
        int mid = s.length()/2;
        String prefix = s.substring(0, mid);
        String suffix = s.substring(mid + 1);

        
        System.out.println(prefix);
        System.out.println(suffix);
    }
}
