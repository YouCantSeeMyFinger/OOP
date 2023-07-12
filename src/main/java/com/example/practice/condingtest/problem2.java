package com.example.practice.condingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 문제
 * 인자 A B C  3개를 받아 A부터 B사이에 있는 C의 배수의 합을 구하는 함수를 만들어라.
 * EX ) 3의 배수
 */


public class problem2 {

    public static int a;
    public static int b;
    public static int c;

    public static List<Integer> list;
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        try {
            inputData();
            printNumber(logic(a, b, c));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void inputData() throws IOException {
        a = Integer.parseInt(br.readLine().trim());
        b = Integer.parseInt(br.readLine().trim());
        c = Integer.parseInt(br.readLine().trim());
        System.out.println("Input Data => a:" + a + " b:" + b + " c:" + c);
    }

    public static List<Integer> logic(int a, int b, int c) {
        list = new ArrayList<>();
        while (a <= b) {
            if (a % c == 0) {
                list.add(a);
            }
            a++;
        }
        return list;
    }

    public static void printNumber(List<Integer> list) {
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
