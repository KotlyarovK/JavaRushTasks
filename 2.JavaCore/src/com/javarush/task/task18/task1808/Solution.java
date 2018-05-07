package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(name1);
        FileOutputStream outputStream1 = new FileOutputStream(name2);
        FileOutputStream outputStream2 = new FileOutputStream(name3);

        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            if(inputStream.available()%2 == 0) {
                byte[] o1 = new byte[inputStream.available()/2];
                byte[] o2 = new byte[inputStream.available()/2];
                int count1 = inputStream.read(o1);
                int count2 = inputStream.read(o2);
                outputStream1.write(o1, 0, count1);
                outputStream2.write(o2, 0, count2);
            } else {
                byte[] o1 = new byte[inputStream.available()/2+1];
                byte[] o2 = new byte[inputStream.available()/2];
                int count1 = inputStream.read(o1);
                int count2 = inputStream.read(o2);
                outputStream1.write(o1, 0, count1);
                outputStream2.write(o2, 0, count2);
            }

        }


        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
