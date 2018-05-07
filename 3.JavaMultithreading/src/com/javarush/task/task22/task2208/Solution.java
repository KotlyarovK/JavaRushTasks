package com.javarush.task.task22.task2208;

import java.util.Map;
import java.util.TreeMap;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<String, String>();
        treeMap.put("name", null);
        treeMap.put("country", null);
        treeMap.put("city", null);
        treeMap.put("age", null);
        System.out.println(getQuery(treeMap));

    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry pair: params.entrySet()) {
            if (pair.getValue() != null) {
                builder.append(pair.getKey() + " = '" + pair.getValue() + "' and ");
            }
        }
        if (builder.length() > 0) {
            int last = builder.lastIndexOf("and");
            builder.replace(last, builder.length(), "");
        }
        return builder.toString().trim();
    }
}
