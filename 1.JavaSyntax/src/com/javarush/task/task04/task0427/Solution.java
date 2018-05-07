package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
        String s = rb.readLine();
        int n = Integer.parseInt(s);

        if (n>999){
            return;
        }

        else if (n /100 >=1) {
            if (n % 2 == 0)
                System.out.println("четное трехзначное число");
            else
                System.out.println("нечетное трехзначное число");
        }
        else if (n /10 >=1) {
            if (n % 2 == 0)
                System.out.println("четное двузначное число");
            else
                System.out.println("нечетное двузначное число");
        }

        else if (n/1 >= 1) {
            if (n % 2 == 0)
                System.out.println("четное однозначное число");
        else
                System.out.println("нечетное однозначное число");

        }
    }
}