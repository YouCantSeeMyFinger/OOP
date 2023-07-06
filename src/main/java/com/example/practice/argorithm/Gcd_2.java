package com.example.practice.argorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 * 최대공약수 최소공배수 Ver.2
 */
public class Gcd_2 {

    public static int a;
    public static int b;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");

        a = Integer.parseInt(s[0]);
        b = Integer.parseInt(s[1]);

        // a > b가 항상 true가 되도록 설정

        if (b > a) {
            int temp = b;
            b = a;
            a = temp;
        }

        int result = gcd(a, b);
        System.out.println("최대 공약수 : " + result);
        System.out.println("최소 공배수 : " + (a * b) / 2);
    }

    public static int gcd(int a, int b) {
        if (a % b == 0) {
            // 나누어 떨어진다면 b자체가 최대 공약수
            return b;
        }

        return gcd(b, a % b);
    }
}

