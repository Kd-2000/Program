package com.Java.Problems.Day_1;

import java.util.Scanner;

public class Factorial {
    public static int findFactorial(int num){
        int result=1;
        for (int i=1;i<=num;i++){
            result*=i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=s.nextInt();
        int result=findFactorial(num);
        System.out.println("result is : "+result);

    }

}
