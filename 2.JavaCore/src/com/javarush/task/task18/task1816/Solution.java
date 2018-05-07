package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        String name = args[0];
        int count = 0;
        try {
            FileInputStream inputStream = new FileInputStream(name);
            byte[] buffer = new byte[1000];
            if (inputStream.available() > 0) inputStream.read(buffer);
            for (int i = 0; i < buffer.length; i++) {
                if (buffer[i] > 64 && buffer[i] < 91) count++;
                else if (buffer[i] > 96 && buffer[i] < 123) count++;
            }
            inputStream.close();
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
