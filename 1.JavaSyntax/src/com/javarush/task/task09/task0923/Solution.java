package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Гласные и согласные
vowels
consonants
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String vowels = "";
        String consonants = "";

        char[] tmp = s.toCharArray();
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] != ' ') {
                if (isVowel(tmp[i])) {
                    vowels += tmp[i] + " ";
                } else consonants += tmp[i] + " ";
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;

        }
        return false;
    }
}