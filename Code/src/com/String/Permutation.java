package com.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {

    public static ArrayList<String> solve(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();


        for(int i = 0; i <= p.length(); i++){

            String f = p.substring(0,i);

            String s = p.substring(i,p.length());

            ans.addAll(solve(f + ch + s, up.substring(1)));
        }

        return ans;



    }
    public static void main(String[] args){
        String s = "abc";
        ArrayList<String> list = solve("",s);
        System.out.println(list);
    }
}
