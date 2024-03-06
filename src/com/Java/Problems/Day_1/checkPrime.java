package com.Java.Problems.Day_1;

import java.util.Scanner;

public class checkPrime {
    public static boolean isPrime(int num){
        if(num==1){
            return false;
        }
        if(num==2 || num==3){
            return true;

        }
        if(num%2==0 || num%3==0){
            return false;
        }
        for(int i=5;i*i<=num;i+=6){
            if(num%i==0 || num%(i+2)==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number to check given number is prime or not");
        int num=s.nextInt();
        if(isPrime(num)){
            System.out.println("Given Number is prime");
        }else{
            System.out.println("Given number is not prime");
        }

    }
}
