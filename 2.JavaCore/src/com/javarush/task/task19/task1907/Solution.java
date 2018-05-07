package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        String str;
        String[] massStr;
        int count = 0;
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr = new BufferedReader(new FileReader(reader.readLine()));
        while ((str =fr.readLine()) != null) {
            massStr = str.split("\\W");
            for (int i = 0; i < massStr.length; i++) {
                list.add(massStr[i]);
            }
        }
        count = Collections.frequency(list,"world");
        reader.close();
        fr.close();
        System.out.println(count);
    }
}
