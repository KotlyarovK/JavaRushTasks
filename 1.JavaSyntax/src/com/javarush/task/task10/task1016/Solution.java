package com.javarush.task.task10.task1016;

import javafx.print.Collation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        for (int i = 0; i < list.size(); i++) {
            String tmp = list.get(i);

            if (!result.containsKey(tmp)){
                result.put(tmp, 1);
                System.out.println(result.containsKey(tmp));
            }
            else {
                System.out.println("элемент существует");
                result.put(tmp, result.get(tmp)+1);
            }
        }
        return result;
    }

}

