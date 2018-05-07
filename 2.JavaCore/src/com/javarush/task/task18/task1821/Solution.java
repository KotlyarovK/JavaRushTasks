package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        TreeMap <Character, Integer> treeMap = new TreeMap<Character, Integer>();
        byte[] bytes;
        try {
            FileInputStream fin = new FileInputStream(args[0]);
            bytes = new byte[fin.available()];
            fin.read(bytes);
            for (int i = 0; i < bytes.length; i++) {
                if (treeMap.containsKey((char) bytes[i])) {
                    int count = treeMap.get((char) bytes[i]);
                    treeMap.put((char) bytes[i], ++count);
                } else treeMap.put((char)bytes[i], 1);
            }
            fin.close();
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Map.Entry pair : treeMap.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

    }
}
