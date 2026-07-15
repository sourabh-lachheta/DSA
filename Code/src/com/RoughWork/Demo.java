package com.RoughWork;


import java.util.ArrayList;

public class Demo {
   public static void main(String[] args){
      String name = "sourabh";
      int start = 0;
      int end = name.length()-1;
      while(start < end){
          if(name.charAt(start) == name.charAt(end)){
              start++;
              end--;
          }else{
              System.out.println("not p");
          }
      }




   }


}
