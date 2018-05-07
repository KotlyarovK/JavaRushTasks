package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fo = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();
        ArrayList<String> list = new ArrayList<String>();
        String[] massStr;
        String str;
        while ((str =fr.readLine()) != null) {
                list.add(str.replace(".", "!"));
        }
          //  str.replaceAll(".", "?");
        for (String s : list) {
                fo.write(s + "\n");
        }

        fr.close();
        fo.close();
    }
}
