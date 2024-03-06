package com.Java.Problems.Day_1;

import java.util.Scanner;

public class findLcm {
    public static int Find_lcm(int a,int b){
        return (a*b)/gcdOrHcf.findGcdUsingEuclids(a,b);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println(Find_lcm(a,b));
    }
}
