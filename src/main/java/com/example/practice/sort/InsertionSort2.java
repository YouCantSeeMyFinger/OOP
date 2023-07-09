package com.example.practice.sort;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/**
 * 삽입 정렬 문제 <br>
 * 삽입 정렬 관련 정보 <br>
 * https://st-lab.tistory.com/179
 */
@Slf4j
public class InsertionSort2 {

    public static List<Integer> integerData = new ArrayList<>();
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        convertAndAddToIntList(inputString());
        insertionSort1(integerData);

    }

    private static void insertionSort1(List<Integer> integerData) {

        for (int i = 1; i < integerData.size(); i++) {

            int j = i - 1;
            int value = integerData.get(i);

            while (j >= 0 && value < integerData.get(j)) {
                integerData.set(j + 1, integerData.get(j));
                j--;
            }
            integerData.set(j + 1, value);
            System.out.println(integerData);
        }
    }

    private static void convertAndAddToIntList(List<String> list) {
        for (String s : list) {
            integerData.add(Integer.parseInt(s));
        }
    }

    private static List<String> inputString() throws IOException {
        return List.of(br.readLine().split(" "));
    }

}
