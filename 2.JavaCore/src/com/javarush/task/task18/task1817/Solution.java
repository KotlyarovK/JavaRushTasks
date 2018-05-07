package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) {
        String name = args[0];
        int symbols = 0;
        int space = 0;
        try {
            FileInputStream inputStream = new FileInputStream(name);
            byte[] buffer = new byte[1000];
            if (inputStream.available() > 0) inputStream.read(buffer);
            for (int i = 0; i < buffer.length; i++) {
                if (buffer[i] > 31 && buffer[i] < 127) symbols++;
                if (buffer[i] == 32) space++;
            }
            inputStream.close();
            String pattern = "##0.00";
            DecimalFormat decimalFormat = new DecimalFormat(pattern);
            String format = decimalFormat.format((double) space/symbols*100);
            System.out.println(format);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
