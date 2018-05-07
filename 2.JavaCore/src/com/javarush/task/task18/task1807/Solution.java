package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(name);
        int tmp;
        int summ = 0;
        while (fileInputStream.available() > 0) {
            tmp = fileInputStream.read();
            if (tmp == 44) summ++;
        }
        fileInputStream.close();
        System.out.println(summ);
    }
}
