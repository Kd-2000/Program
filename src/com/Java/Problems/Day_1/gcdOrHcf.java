package com.Java.Problems.Day_1;

import java.util.Scanner;

public class gcdOrHcf {

    public static int findGcd(int a, int b) {
        int min = findMin(a, b);

        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;

    }

    public static int findMin(int a, int b) {
        return Math.min(a, b);
    }

    public static int findGcdUsingEuclids(int a, int b) {
        while (a != 0 && b != 0) {
            if (findMax(a, b)) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a != 0) {
            return a;
        }
        return b;
    }

    public static boolean findMax(int a, int b) {
        return a > b;

    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter numbers to find gcd of given 2 number");
        int a = s.nextInt();
        int b = s.nextInt();
        //int result = findGcd(a, b);
        int result = findGcdUsingEuclids(a, b);
        System.out.println("Result is :" + result);
    }
}
