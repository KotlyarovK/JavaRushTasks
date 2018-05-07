package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // чтение построчно
        int tmp = 0;
        int summ = 0;
        while (tmp != -1) {
            tmp = Integer.parseInt(br.readLine());
            summ += tmp;
        }
        System.out.println(summ);

    }
}
