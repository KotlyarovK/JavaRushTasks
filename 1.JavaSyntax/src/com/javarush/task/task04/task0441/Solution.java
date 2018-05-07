package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        System.out.println(max_min(a,b,c));

    }

    public static int max_min(int a, int b, int c){

        if (a > b && a < c || a < b && a > c)
            return a;
        else if (b > a && b < c || b < a && b > c)
                return b;
        else if (c > a && c < b || c < a && c > b)
                return c;
        else if (a == b || a == c)
                return a;
        else if (b == c || b == a)
                return b;
        else
            return c;
    }
}
