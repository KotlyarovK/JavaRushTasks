package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {
       min(5.43, 6.72);
       min((long) 56, 34);
       min(5,4);


    }

    public static int min(int a, int b ) {
        return a>b ? b:a;
    }

    public static long min(long a, long b) {
        return a>b ? b:a;
    }

    public static double min(double a, double b) {
        return a>b ? b:a;
    }
    //Напишите тут ваши методы
}
