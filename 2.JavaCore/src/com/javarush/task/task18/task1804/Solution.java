package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
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

        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();

        for (int i = 0; i < list.size(); i++) {
            if(hashMap.containsKey(list.get(i))) {
                int count = hashMap.get(list.get(i));
                hashMap.put(list.get(i), ++count);
            } else {
                hashMap.put(list.get(i), 1);
            }
        }

        for (Map.Entry pair : hashMap.entrySet()) {
            if (pair.getValue() == (Integer) 1)
                System.out.print(pair.getKey()+ " ");
        }
    }
}
