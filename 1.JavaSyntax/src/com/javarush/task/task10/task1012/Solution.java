package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;
import java.util.TreeMap;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        String mainStr = "";

        for (int i = 0; i < list.size(); i++) {
            mainStr += list.get(i) + " ";
        }
        char[] charArray = mainStr.toCharArray();



        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < alphabet.size(); i++) {
            treeMap.put(alphabet.get(i), 0);
        }

        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < alphabet.size(); j++) {
                if (charArray[i]==alphabet.get(j)) {
                    for (Map.Entry pair : treeMap.entrySet()) {
                        if (pair.getKey().equals(charArray[i])) {
                            int a = (int) pair.getValue() +1;
                            treeMap.put(charArray[i], a);
                        }
                    }

                }
            }
        }

        for (Map.Entry pair : treeMap.entrySet()) {
            if (pair.getKey().equals('ё')) break;
            System.out.println(pair.getKey()+ " " + pair.getValue());
            if (pair.getKey().equals('е')) {
                for (Map.Entry special : treeMap.entrySet()) {
                    if (special.getKey().equals('ё')) {
                    System.out.println(special.getKey() + " " + special.getValue());
                    }
                }
            }
        }
    }

}
