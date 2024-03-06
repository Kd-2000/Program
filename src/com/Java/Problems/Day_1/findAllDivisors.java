package com.Java.Problems.Day_1;

import java.util.Scanner;

public class findAllDivisors {

    public static void findDivisor(int num){
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                System.out.println(i);
                if(i!=num/i)
                    System.out.println(num/i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter num to print all divisors");
        int num=s.nextInt();
        findDivisor(num);
    }

}
