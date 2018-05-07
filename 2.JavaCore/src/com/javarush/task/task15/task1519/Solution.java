package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String tmp;
        while (true) {
            tmp = reader.readLine();
            if(tmp.equals("exit")) break;

            if (tmp.contains(".")) {
                try {
                    double numeric = Double.parseDouble(tmp);
                    print(numeric);
                } catch (Exception e) {
                    print(tmp);
                }
            } else if(isNumber(tmp)) {
                int numeric = Integer.parseInt(tmp);
                if (numeric > 0 && numeric < 128) print((short) numeric);
                else print(numeric);
            } else if(tmp.contains("-")){
                try {
                    int numeric = Integer.parseInt(tmp);
                    print(numeric);
                } catch (Exception e) {
                    print(tmp);
                }
            } else print(tmp);
        }
    }

    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
