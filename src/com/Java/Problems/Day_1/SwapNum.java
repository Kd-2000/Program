package com.Java.Problems.Day_1;

import java.util.Scanner;

public class SwapNum {
    public static void swap(int a,int b){

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swapping using XOR bitwise operator
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 2 number to swaap");
        int a=s.nextInt();
        int b=s.nextInt();
        swap(a,b);

    }
}
