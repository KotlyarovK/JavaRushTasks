package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        byte[] bytes1;
        byte[] bytes2;
        try {
            String name1 = reader.readLine();
            String name2 = reader.readLine();
            FileInputStream fi1 = new FileInputStream(name1);
            bytes1 = new byte[fi1.available()];
            fi1.read(bytes1);
            fi1.close();
            FileOutputStream fo1 = new FileOutputStream(name1);
            FileInputStream fi2 = new FileInputStream(name2);


            bytes2 = new byte[fi2.available()];
            fi2.read(bytes2);
            fo1.write(bytes2);
            fo1.write(bytes1);

            fo1.close();
            fi2.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
