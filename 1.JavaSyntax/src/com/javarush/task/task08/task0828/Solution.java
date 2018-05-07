package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
        public static void main (String[]args) throws IOException {
            //напишите тут ваш код
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Map<Integer, String> months = new HashMap<Integer, String>();
            months.put(1, "January");
            months.put(2, "February");
            months.put(3, "March");
            months.put(4, "April");
            months.put(5, "May");
            months.put(6, "June");
            months.put(7, "July");
            months.put(8, "August");
            months.put(9, "September");
            months.put(10, "October");
            months.put(11, "November");
            months.put(12, "December");


            while (true) {
                Iterator<Map.Entry<Integer, String>> iterator = months.entrySet().iterator();
                String value = reader.readLine();
                while (iterator.hasNext()) {
                    //получение «пары» элементов
                    Map.Entry<Integer, String> pair = iterator.next();
                    //значение
                    String month = pair.getValue();
                    Integer key = pair.getKey();            //ключ
                    if (value.equals(month))
                        System.out.println(value + " is " + key + " month");
                }
            }
        }
    }
