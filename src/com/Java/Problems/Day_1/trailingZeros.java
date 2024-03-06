package com.Java.Problems.Day_1;

import java.util.Scanner;

public class trailingZeros {

    public static int findTrailingZero(int num){
        int result=0;
        int powOf5=5;
        while(num>=powOf5){
            result+=(num/powOf5);
            powOf5*=5;
        }
        return result ;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number to find trailing Zeros");
        int num=s.nextInt();
        int result=findTrailingZero(num);
        System.out.println("Result is : "+result);
    }
}
