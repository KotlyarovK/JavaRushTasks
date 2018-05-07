package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fo = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();
        ArrayList<String> list = new ArrayList<String>();
        String[] massStr;
        String str;
            while ((str =fr.readLine()) != null) {
                massStr = str.split(" ");
                for (int i = 0; i < massStr.length; i++) {
                    list.add(massStr[i]);
                }
        }

        for (String s : list) {
                try {
                    int num = Integer.parseInt(s);
                    fo.write(num + " ");
                } catch (NumberFormatException e) {
                    // no number
                }
        }

            fr.close();
            fo.close();

    }
}
