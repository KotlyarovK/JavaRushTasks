package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String name1 = reader.readLine();
            String name2 = reader.readLine();
            String name3 = reader.readLine();
            FileOutputStream fo = new FileOutputStream(name1);
            FileInputStream fi1= new FileInputStream(name2);
            FileInputStream fi2 = new FileInputStream(name3);
            byte[] buff1 = new byte[fi1.available()];
            byte[] buff2 = new byte[fi2.available()];
            fi1.read(buff1);
            fi2.read(buff2);
            fo.write(buff1);
            fo.write(buff2);
            fo.close();
            fi1.close();
            fi2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
