package com.example.practice.condingtest;

import java.util.Arrays;

/**
 * 아이티 컨버젼스
 * 회사 위치 : 방이동역 800m
 * 실제 코딩문제
 */

public class 아이티컨버젼스 {


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int b[];
        b = a;
        a = new int[6];

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));



    }
}
