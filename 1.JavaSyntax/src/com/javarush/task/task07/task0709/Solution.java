package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int min = 0;

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }


        Collections.sort(list);
        min = list.get(0).length();

        for (int i = 0; i < list.size(); i++) {
            int size = list.get(i).length();
            if (size <= min) {
                System.out.println(list.get(i));
            }
        }

    }
}
