package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/*
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList();
        int max = 1;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
        }

        Collections.sort(arrayList);

            for (int i = 0; i < arrayList.size()-1; i++) {
                if (arrayList.get(i).equals(arrayList.get(i+1))) {
                    count++;
                    if (max< count) {
                        max = count;
                    }
                }
                else {
                   count = 1;
                }
        }
        System.out.println(max);
    }

}