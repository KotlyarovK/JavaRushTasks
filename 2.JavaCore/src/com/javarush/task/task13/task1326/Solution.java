package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameInFile = reader.readLine();
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(nameInFile)));
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (true) {
            String str = br.readLine();
            if (str == null) break;
            try {
                if (Integer.parseInt(str)%2 == 0 )
                list.add(Integer.parseInt(str));
            } catch (Exception e) {
            }
        }

        reader.close();
        br.close();

        Collections.sort(list);

        for (int i : list ) {
            System.out.println(i);
        }
    }
}
