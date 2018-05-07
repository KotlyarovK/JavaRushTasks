package com.javarush.task.task05.task0532;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        int count = Integer.parseInt(reader.readLine());
        if (count < 0) return;
        int arr[] =new int[count];

        for (int i = 0; i < count; i++) {
            int tmp = Integer.parseInt(reader.readLine());
            arr[i] = tmp;
        }

        Arrays.sort(arr);
        maximum = arr[count-1];

        //напишите тут ваш код

        System.out.println(maximum);
    }
}
