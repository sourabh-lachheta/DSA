package com.String.Problems;

public class IpAddress_1108 {
     static String defangIPaddr(String address) {
         StringBuilder s = new StringBuilder();
         for(int i= 0; i < address.length(); i++){
             if(address.charAt(i) == '.'){
                 s.append("[.]");
             }else{
                 s.append(address.charAt(i));
             }
         }
      return s.toString();
    }
    public static void main(String[] args){
        String address = "1.1.1.1.1";
        System.out.println(defangIPaddr(address));


    }
}
