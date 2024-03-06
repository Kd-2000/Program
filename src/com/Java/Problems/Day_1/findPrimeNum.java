package com.Java.Problems.Day_1;

import java.util.Scanner;

public class findPrimeNum {

    public static void findPrime(int num) {

        boolean[] prime = new boolean[num + 1];

        for (int i = 2; i * i <= num; i++) {
            if (!prime[i]) {
                for (int j = i * i; j <= num; j = j + i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i <= num; i++) {
            if (!prime[i])
                System.out.println(i);

        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter num to print all prime numbers");
        int a = s.nextInt();
        findPrime(a);
    }

}
