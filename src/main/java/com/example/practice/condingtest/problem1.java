package com.example.practice.condingtest;

import lombok.extern.slf4j.Slf4j;


/**
 * https://workerst.tistory.com/91 <br>
 */
@Slf4j
public class problem1 {

    public static int num = 5;
    public static int out = 0;
    public static int t = 3;

    /**
     * process <br>
     * 1 ) out = 3 <br>
     * 2 ) out = 6 <br>
     * 3 ) if => out * num : 30 <br>
     * 4 ) if => out * i : 60 <br>
     *
     * @param args
     */

    public static void main(String[] args) {
        for (int i = 0; i < num; i++) {
            out += t;
            if (out > num) {
                out = out * num;
                out = out * i;
                break;
            }
            i++;
        }
        System.out.println("result : " + out);
    }
}
