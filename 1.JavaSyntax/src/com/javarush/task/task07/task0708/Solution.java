package com.javarush.task.task07.task0708;

import javax.annotation.processing.Completion;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;

        Solution.strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }


        Collections.sort(Solution.strings);
        int length = strings.size() - 1;

        for (int i = length; i > 0; i--) {
            int size = strings.get(i).length();
            if (size >= max) {
                max = size;
                System.out.println(strings.get(i));
            }
        }
    }
}
