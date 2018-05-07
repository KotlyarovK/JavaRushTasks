package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<int[]>();
        int[] mass1  = new int[5];
        int[] mass2  = new int[2];
        int[] mass3  = new int[4];
        int[] mass4  = new int[7];
        int[] mass5  = new int[0];

        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = i;
        }

        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = i;
        }

        for (int i = 0; i < mass3.length; i++) {
            mass3[i] = i;
        }
        for (int i = 0; i < mass4.length; i++) {
            mass4[i] = i;
        }
        list.add(mass1);
        list.add(mass2);
        list.add(mass3);
        list.add(mass4);
        list.add(mass5);

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
