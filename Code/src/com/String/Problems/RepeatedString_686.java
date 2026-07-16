

// LeetCode 686: Repeated String

package com.String.Problems;

public class RepeatedString_686 {

    static  int repeatedStringMatch(String a, String b) {
        StringBuilder temp = new StringBuilder();
        int count = 0;
        for(int i = 1; i <= b.length(); i++){
            //temp = a;
           temp.append(temp);
            System.out.println(temp);

           if(temp.toString().contains(b)){
               return count;
           }

        }

    return -1;
    }
    public static void main(String[] args){
        String a = "abcd";
        String b = "cdabcdab";
        System.out.println(repeatedStringMatch(a,b));

    }
}
