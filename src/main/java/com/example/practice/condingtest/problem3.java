package com.example.practice.condingtest;

public class problem3 {

    /**
     * 반복문 문제
     * a 위치 이동하기.
     */


    // 출력 횟수
    public static final int printNumber = 5;
    public static final int testNumber = 5;

    public static void main(String[] args) {
        pattern1();
        pattern2();
    } // End main

    public static void pattern1() {
        for (int i = 0; i < testNumber; i++) {
            for (int j = 0; j < printNumber; j++) {
                if (i == j) {
                    System.out.print("A");
                } else {
                    System.out.print("a");
                }
            }
            System.out.println();
        }
    }

    public static void pattern2() {
        for (int i = 0; i < testNumber - 1; i++) {
            for (int j = printNumber; j > 0; j--) {
                if (j - i == 2) {
                    System.out.print("A");
                } else {
                    System.out.print("a");
                }
            }
            System.out.println();
        }
    }
} // End Class
