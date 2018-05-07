package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.*;
import java.util.zip.InflaterInputStream;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();
    public static Properties property = new Properties();

    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fio = new FileInputStream(reader.readLine());
        reader.close();
        load(fio);

    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties props = new Properties();
        for (Map.Entry<String, String> pairs : properties.entrySet()) {
            props.put(pairs.getKey(), pairs.getValue());
        }
        props.store(outputStream, "");
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        property.load(reader);
        Set<String> set = property.stringPropertyNames();
        for (String s :set) {
            properties.put(s, property.getProperty(s));
        }
        reader.close();
    }

    public static void main(String[] args) throws Exception {
        new Solution().fillInPropertiesMap();
        System.out.println(properties);
        new Solution().save(new FileOutputStream("test.txt"));
    }
}
