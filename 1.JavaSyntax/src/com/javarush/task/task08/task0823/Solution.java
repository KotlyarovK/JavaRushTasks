package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        //напишите тут ваш код
        String arr[] = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.substring(i, i + 1);
        }

        s = arr[0].toUpperCase();
        for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1].equals(" "))
                    s += arr[i].toUpperCase();
                else s += arr[i];
        }

        System.out.println(s);
    }
}
/*
    String[] arr = s.split(" ");
    StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
        sb.append(Character.toUpperCase(arr[i].charAt(0)))
        .append(arr[i].substring(1)).append(" ");
        }
        String s1 = sb.toString().trim();

        System.out.println(s1);
        */