package com.stackroute.pg2;
import java.io.BufferedReader; //to read our data
import java.io.FileReader;      //to read file
import  java.io.IOException;    //handle exceptions thrown by buffer reader


public class ReadTextFromFile {
    public static void main(String args[]) throws IOException {
        int count=0;
        BufferedReader readData=new BufferedReader(new FileReader("file.txt"));
        String line;
        while ((line=readData.readLine())!=null){
            System.out.println(line.toUpperCase());
            count++;
        }
        System.out.println("size of file is "+count+" line/lines");
    }
}
