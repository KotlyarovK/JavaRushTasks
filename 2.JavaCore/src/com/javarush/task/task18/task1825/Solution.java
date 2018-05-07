package com.javarush.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> fis = new ArrayList<String>();
        String name;
        byte[] bytes;

        while (true) {
            name = reader.readLine();
            if (name.equals("end")) break;
            fis.add(name);
        }

        String[] str = fis.get(0).split(".part");
        name = str[0];

        FileOutputStream fos = new FileOutputStream(name, true);


        Collections.sort(fis);
        for (String fileName : fis) {
            FileInputStream br = new FileInputStream(fileName);
            bytes = new byte[br.available()];
            br.read(bytes);
            fos.write(bytes);
            br.close();
        }
        fos.close();

    }
}
