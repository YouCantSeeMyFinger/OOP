package com.example.practice.argorithm;

import java.util.Scanner;


/**
 * 최대 공약수 최소공배수 ver.1
 */
public class Gcd_1 {

    public static int a;
    public static int b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        if (b > a) {
            int temp = b;
            a = b;
            b = temp;
        }

        int result = gcd(a, b);
        System.out.println("최대 공약수 :" + result);
        System.out.println("최소 공배수 :" + a * b / result);
    } // End main

    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}
