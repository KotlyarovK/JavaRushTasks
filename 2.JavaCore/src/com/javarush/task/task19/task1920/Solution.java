package com.javarush.task.task19.task1920;

/* 
Самый богатый
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
        double max = 0;
        while ((str = fileIn.readLine()) != null) {
            String[] bufferWord = str.split(" ");
            if (map.containsKey(bufferWord[0])) {
                double tmp = map.get(bufferWord[0]);
                tmp += Double.parseDouble(bufferWord[1]);
                map.put(bufferWord[0], tmp);
                if (tmp > max) max = tmp;
            } else {
                map.put(bufferWord[0], Double.parseDouble(bufferWord[1]));
                double tmp = Double.parseDouble(bufferWord[1]);
                if (tmp > max) max = tmp;
            }

        }

        for (Map.Entry pair: map.entrySet()) {
            if (pair.getValue().equals(max)) {
                System.out.println(pair.getKey());
            }
        }
        fileIn.close();
    }
}
