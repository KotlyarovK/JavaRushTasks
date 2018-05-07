package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
       String [] arrStr = getTokens("Good news everyone!", "ne");
        for (String s: arrStr) {
            System.out.println(s);
        }
    }
    public static String [] getTokens(String query, String delimiter) {
        ArrayList<String> list = new ArrayList<String>();
        String[] token;
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        while (tokenizer.hasMoreTokens()) {
            list.add(tokenizer.nextToken());
        }
        token = list.toArray(new String[list.size()]);
        return token;
    }
}
