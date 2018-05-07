package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        ArrayList<String> list = new ArrayList<String>();
        String tmp;
        while ((tmp = fr.readLine()) != null) {
            list.add(tmp);
        }
        fr.close();

        for (String s : list) {
            for (int i =  s.length()-1; i >= 0; i--) {
                System.out.print(s.charAt(i));
            }
            System.out.print("\n");
        }
    }
}
