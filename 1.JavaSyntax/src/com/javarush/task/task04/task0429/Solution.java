package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
        int mass[] = new int[3];
        String s;
        s = rb.readLine();
        mass[0] = Integer.parseInt(s);
        s = rb.readLine();
        mass[1] = Integer.parseInt(s);
        s = rb.readLine();
        mass[2] = Integer.parseInt(s);

        int tmp_p = 0;
        int tmp_n = 0;
        for (int i = 0; i < 3; i++) {
            if (mass[i] > 0){
                tmp_p++;
            }
            else if (mass[i] < 0){
                tmp_n++;
            }

        }
        System.out.println("количество отрицательных чисел: " + tmp_n);
        System.out.println("количество положительных чисел: " + tmp_p);



    }
}
