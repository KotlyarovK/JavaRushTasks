package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // чтение построчно
        int tmp = 0;
        int summ = 0;
        double count = 0;
        while (true) {
            tmp = Integer.parseInt(br.readLine());
            if (tmp == -1) break;
            summ += tmp;
            count ++;
        }
        System.out.println(summ/count);

        //напишите тут ваш код
    }
}

