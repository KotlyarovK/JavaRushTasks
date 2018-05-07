package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) return;
        BufferedReader fileIn = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> map = new TreeMap<String, Double>();
        String str;
        while ((str = fileIn.readLine()) != null) {
            String[] bufferWord = str.split(" ");
            if (map.containsKey(bufferWord[0])) {
                double tmp = map.get(bufferWord[0]);
                tmp += Double.parseDouble(bufferWord[1]);
                map.put(bufferWord[0], tmp);
            } else
                map.put(bufferWord[0], Double.parseDouble(bufferWord[1]));
        }

        for (Map.Entry pair: map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        fileIn.close();
    }
}
