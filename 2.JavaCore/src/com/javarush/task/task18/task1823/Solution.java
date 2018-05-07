package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name;
        while (!(name = reader.readLine()).equals("exit")) {
           new ReadThread(name).start();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;
        private FileInputStream fi;
        private byte[] buff;
        private HashMap <Byte, Integer> hashMap;
        int max = 0;

        public ReadThread(String fileName) throws IOException {
            //implement constructor body
            hashMap = new HashMap<>();
            fi = new FileInputStream(fileName);
            buff = new byte[fi.available()];
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут
        @Override
        public void run() {
            try {
                fi.read(buff);

                for (byte b : buff) {
                    if (hashMap.containsKey(b)) {
                        int count = hashMap.get(b);
                        hashMap.put(b, ++count);
                        if (count > max) max = count;
                    }
                    else {
                        hashMap.put( b, 1);
                    }
                }

                for (Map.Entry pair : hashMap.entrySet()) {
                    if (pair.getValue().equals(max)) {
                        Byte tmp = (Byte) pair.getKey();
                        resultMap.put(fileName, (int)tmp);
                    }
                }
                System.out.println(resultMap);
                fi.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

