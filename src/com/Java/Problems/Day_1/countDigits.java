package com.Java.Problems.Day_1;

import java.util.Scanner;

public class countDigits {

    public static int counter(int num){
        int result=0;
        while(num>0){
           num= num/10;
           result++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number to cont digits");
        int num=s.nextInt();
        int result=counter(num);
        System.out.println("Result is : "+result);
    }
}
