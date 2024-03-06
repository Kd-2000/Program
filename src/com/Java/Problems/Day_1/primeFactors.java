package com.Java.Problems.Day_1;

import java.util.ArrayList;
import java.util.Scanner;

public class primeFactors {

    public static void printPrimeFactors(int n){
        ArrayList<Integer> a=new ArrayList<>();
        int i=2;
        while(i*i<=n){
            while(n%i==0){
                a.add(i);
                n=n/i;
            }
            i++;
        }
        if(n>1)
            a.add(n);

        System.out.println("Prime factors are: "+a);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter num to print all prime factors of given number");
        int num=s.nextInt();
        printPrimeFactors(num);
    }
}
