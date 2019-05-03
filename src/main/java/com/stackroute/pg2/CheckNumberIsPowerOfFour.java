package com.stackroute.pg2;

import java.util.Scanner;

public class CheckNumberIsPowerOfFour {

    private  static int testNumber,n;
    private  static  String hold;


    public static String isPowerOfFour(int n){
        if(n == 0)
            return "Number is 0";

        while(n != 1)
        {
            if(n % 4 != 0)
                return "is not a power of 4";
            n = n / 4;
        }

        if(n == 1)
            hold= "is a power of 4";
        else if( n!=0)
            hold= "is not a power of 4";

        return hold;
    }

}
