package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int a = 0;

        while (count>0) {
           a = count % 10;
           count /=10;
           if (a%2 == 0) even++;
           else odd++;
        }

        System.out.println("Even: " + even + " Odd: " + odd);

        //напишите тут ваш код
    }
}
