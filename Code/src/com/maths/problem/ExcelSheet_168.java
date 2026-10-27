package com.maths.problem;

public class ExcelSheet_168 {

    public  static String convertToTitle(int columnNumber) {

        return solve(columnNumber);

    }

    public static String solve(int columnNumber){

        StringBuilder sb = new StringBuilder();

        if(columnNumber <= 0){
            return "";
        }

        while(columnNumber > 0){
            columnNumber--;
            sb.insert(0, (char)('A' + (columnNumber % 26)));
            columnNumber /= 26;
        }
        return sb.toString();
    }

    public static void main(String[] args){
        int columnNumber = 1;
        System.out.println(convertToTitle(columnNumber));
    }
}
