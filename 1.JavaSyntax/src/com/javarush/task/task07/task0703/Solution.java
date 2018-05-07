package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int mass[] = new int[10];
        String s[] = new String[10];

        for (int i = 0; i < 10; i++) {
            s[i] = br.readLine();
            mass[i] = s[i].length();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(mass[i]);
        }
    }
}
