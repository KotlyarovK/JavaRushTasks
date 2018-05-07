package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        ArrayList<String> arrayListStr = new ArrayList<>();
        ArrayList<String> arrayListInt = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            Boolean tmp = isNumber(array[i]);
            if (tmp == true) {
                arrayListInt.add(array[i]);
            }
            else
                arrayListStr.add(array[i]);
        }

        String[] arrayStr = arrayListStr.toArray(new String[arrayListStr.size()]);
        String[] arrayInt = arrayListInt.toArray(new String[arrayListInt.size()]);

        int maxIndexStr = arrayListStr.size()-1;
        for (int i = maxIndexStr; i >= 0 ; i--) {
            for (int j = 0; j < maxIndexStr; j++) {
                Boolean tmp = isGreaterThan(arrayStr[j], arrayStr[j+1]);
                if (tmp == true) {
                    String s = arrayStr[j];
                    arrayStr[j] = arrayStr[j+1];
                    arrayStr[j+1] = s;
                }
            }
        }

        int maxIndexInt = arrayListInt.size();
        Integer[] arrayTmp = new Integer[maxIndexInt];
        for (int i = 0; i < maxIndexInt; i++) {
            arrayTmp[i] = Integer.parseInt(arrayInt[i]);
        }
        Arrays.sort(arrayTmp, Collections.reverseOrder());
        int countINT = 0;
        int countSTR = 0;
        for (int i = 0; i < array.length; i++) {
            Boolean tmp = isNumber(array[i]);
            if (tmp == true) {
                array[i] = arrayTmp[countINT].toString();
                countINT++;
            }
            else {
               array[i]= arrayStr[countSTR];
               countSTR++;
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') // не цифра и не начинается с '-'
                    || (i == 0 && c == '-' && chars.length == 1)) // не '-'
            {
                return false;
            }
        }
        return true;
    }
}
