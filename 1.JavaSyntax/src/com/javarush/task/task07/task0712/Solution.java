package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        //напишите тут ваш код
        int max = 0;
        int min = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
        list.add(reader.readLine());
        }
        // Поиск max
        for (int i = 0; i < list.size(); i++) {
            int tmp = list.get(i).length();
            if (tmp > max)
                max = tmp;
        }

        min = max;
        // Поиск min
        for (int i = 0; i < list.size(); i++) {
            int tmp = list.get(i).length();
            if (tmp < min)
                min = tmp;
        }

        for (int i = 0; i < list.size() ; i++) {
            int tmp = list.get(i).length();
            if (tmp == max) {
                System.out.println(list.get(i));
                return;
            }
            else if (tmp == min) {
                System.out.println(list.get(i));
                return;
            }
        }
    }
}
