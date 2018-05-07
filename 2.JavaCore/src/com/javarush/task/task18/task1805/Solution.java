package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        ArrayList<Integer> list = new ArrayList<Integer>();
        FileInputStream fileInputStream = new FileInputStream(name);
        while (fileInputStream.available() > 0) {
            list.add(fileInputStream.read());
        }
        fileInputStream.close();

        TreeMap<Integer,Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < list.size(); i++) {
            if(treeMap.containsKey(list.get(i))) {
                int count = treeMap.get(list.get(i));
                treeMap.put(list.get(i), ++count);
            } else {
                treeMap.put(list.get(i), 1);
            }
        }

        for (Map.Entry pair : treeMap.entrySet()) {
            System.out.print(pair.getKey()+ " ");
        }
    }
}
