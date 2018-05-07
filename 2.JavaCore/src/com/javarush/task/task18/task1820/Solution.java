package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        byte[] bytes;
        try {
            String name1 = reader.readLine();
            String name2 = reader.readLine();
            FileInputStream fi = new FileInputStream(name1);
            FileOutputStream fo = new FileOutputStream(name2);
            bytes = new byte[fi.available()];
            fi.read(bytes);
            fo.write(doubleToInt(bytes));

            fi.close();
            fo.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static byte[] doubleToInt(byte[] bytes) {
        StringBuilder builder = new StringBuilder();
        String[] s = new String(bytes).split(" ");
        byte[] res;
        long[] tmp = new long[s.length];

        for(int i = 0; i < s.length; i++){
            tmp[i] = Math.round(Double.valueOf(s[i]));
        }

        for(long i : tmp){
            builder.append(i);
            builder.append(" ");
        }

        res = builder.toString().getBytes();

        return res;
    }
}
