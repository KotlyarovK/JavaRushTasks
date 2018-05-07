package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap <String, Integer> hashMap = new HashMap<String, Integer>();
        while (true) {
            try {
                int value = Integer.parseInt(reader.readLine());
                String str = reader.readLine();
                hashMap.put(str, value);
                if (str.isEmpty()) break;
            }
            catch (NumberFormatException e) {
                break;
            }

        }

        for (Map.Entry pair : hashMap.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
