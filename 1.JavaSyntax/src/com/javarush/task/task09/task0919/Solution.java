package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divisionByZero();
        }
        catch (ArithmeticException e) {
            System.out.println(e);
            e.printStackTrace();
            //System.out.println();
        }
    }

    public static void divisionByZero() throws ArithmeticException {
        int a = 5/0;
        System.out.println(a);
    }
}
