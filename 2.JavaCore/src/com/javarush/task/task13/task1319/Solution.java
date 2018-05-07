package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameOutFile = reader.readLine();
        BufferedWriter outStream = new BufferedWriter( new OutputStreamWriter(new FileOutputStream(nameOutFile)));
        String data;
        int info;
        while (true) {
            data = reader.readLine();
            outStream.write(data + "\n");
            if (data.equals("exit")) break;
        }
        outStream.close();
        reader.close();
    }
}
