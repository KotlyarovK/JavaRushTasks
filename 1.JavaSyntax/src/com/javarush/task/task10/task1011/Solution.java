package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        String[] arr = s.split("");
        int arrSize = arr.length;
        for (int i = 0; i < 40; i++) {
            for (int j = i; j < arrSize; j++) {
                System.out.print(arr[j]);
            }
            System.out.println(" ");
        }

        //напишите тут ваш код
    }

}

