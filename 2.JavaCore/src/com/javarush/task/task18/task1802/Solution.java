package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(name);
        int tmp;
        int min = Integer.MAX_VALUE;
        while (fileInputStream.available() > 0) {
            tmp = fileInputStream.read();
            if (tmp < min) min = tmp;
        }
        fileInputStream.close();
        System.out.println(min);
    }
}
