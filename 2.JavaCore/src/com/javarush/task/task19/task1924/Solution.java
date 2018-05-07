package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");

    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader rf = new BufferedReader(new FileReader(reader.readLine()));
        String tmp;
        reader.close();

        ArrayList<String> list = new ArrayList<String>();
        while ((tmp = rf.readLine()) != null) {
            String[] bufferWord = tmp.split(" ");
            for (String s: bufferWord) {
                list.add(s);
            }
        }
        rf.close();

        for (String s: list) {
            try {
                int num = Integer.parseInt(s);
                if (num <= 12) System.out.print(map.get(num)+ " ");
                else System.out.print(s + " ");
            } catch (NumberFormatException e) {
                System.out.print(s + " ");
            }
        }



    }
}
