package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //...
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        ArrayList<String> list = new ArrayList<String>();
        String tmp;
        while ((tmp = fr.readLine()) !=null) {
            list.addAll(Arrays.asList(tmp.split(" ")));
        }
        String[] arrWords = list.toArray(new String[list.size()]);
        StringBuilder result = getLine(arrWords);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, words);
        StringBuilder sb = new StringBuilder();
        if (strings.size() == 0) {
            return new StringBuilder();
        }

        sb.append(strings.get(0));
        strings.remove(0);

        while (strings.size() > 0) {
            for (int i = 0; i < strings.size(); i++) {
                String a = strings.get(i).toUpperCase().toLowerCase();
                String b = sb.toString().toUpperCase().toLowerCase();
                if (a.charAt(0) == b.charAt(sb.length() - 1)) { // в конец
                    sb.append(" ").append(strings.get(i));
                    strings.remove(i);
                    continue;
                }

                if (b.charAt(0) == a.charAt(a.length() - 1)) { //в начало
                    sb.insert(0, " ");
                    sb.insert(0, strings.get(i));
                    strings.remove(i);
                }
            }
        }
        return sb;
    }
}
