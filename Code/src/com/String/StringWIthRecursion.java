package com.String;

public class StringWIthRecursion {

    private static void solve(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            solve(p,up.substring(1));
        }else{
            solve(p+ch,up.substring(1));
        }
    }


    public static void main(String[] args){
        solve("","baccad");
    }
}
