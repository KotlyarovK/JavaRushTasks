package com.javarush.task.task04.task0428;

/* 
Положительное число
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

        int tmp = 0;
        for (int i = 0; i < 3; i++) {
            if (mass[i] > 0){
                tmp++;
            }
        }
        System.out.println(tmp);
    }
}
