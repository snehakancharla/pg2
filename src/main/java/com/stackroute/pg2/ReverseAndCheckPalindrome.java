package com.stackroute.pg2;

import java.util.Scanner;

public class ReverseAndCheckPalindrome {

    private static long number,temp=0,afterReverse,r;
    private static String hold;

    public static String reverseString(long number) {
        temp = number;
        while (number > 0) {

            r = number % 10;
            afterReverse = (afterReverse * 10) + r;
            number = number / 10;
        }
        // checkPalindrome(afterReverse);
        if (temp == afterReverse) {
            hold = "it is a palindrome";

        } else {
            hold = "it is not a palindrome";
        }
        return hold;
    }

   /* public static String checkPalindrome(long reverseValueHolder){

        if (temp== afterReverse){
            hold="it is a palindrome";

        }
        else{
            hold="it is not a palindrome";
        }
        return hold;

    }  */
}
