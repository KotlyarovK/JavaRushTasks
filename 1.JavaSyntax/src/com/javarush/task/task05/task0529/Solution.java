package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String s;
        int summ = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            s = br.readLine();
            if (s.equals("сумма")){
                break;
            }
            else summ += Integer.parseInt(s);
        }
        System.out.println(summ);
    }
}
