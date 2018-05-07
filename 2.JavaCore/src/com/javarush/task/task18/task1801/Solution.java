package com.javarush.task.task18.task1801;

import java.io.*;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream rf = new FileInputStream(name);
        int c;
        int max = -1;
        while (rf.available() > 0) {
            c = rf.read();
          if (c > max) max = c;
        }
        System.out.println(max);
        rf.close();


    }
}
