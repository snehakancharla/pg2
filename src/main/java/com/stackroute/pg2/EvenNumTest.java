package com.stackroute.pg2;

import java.util.Scanner;

public class EvenNumTest {

    public static void main(String[] args){

        int testNumber;
        Scanner in=new Scanner(System.in);
        System.out.println("enter number");
        testNumber=in.nextInt();
        System.out.println(isEven(testNumber)); ;

    }
    public static boolean isEven(int testNumber){

        if(testNumber%2==0)
            return true;
        else
            return false;

    }
}
