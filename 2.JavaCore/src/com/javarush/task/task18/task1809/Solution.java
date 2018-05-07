package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(name1);
        FileOutputStream outputStream = new FileOutputStream(name2);

        byte[] buffer = new byte[inputStream.available()];

        while (inputStream.available() > 0) {
           inputStream.read(buffer);
        }

        for (int i = buffer.length-1; i >= 0; i--) {
            outputStream.write(buffer[i]);
        }


        inputStream.close();
        outputStream.close();
    }
}
