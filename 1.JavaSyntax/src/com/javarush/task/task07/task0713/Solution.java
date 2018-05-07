package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> even_odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < 20; i++) {
            if (list.get(i) % 3 == 0 && list.get(i) % 2 == 0) {
                even.add(list.get(i));
                even_odd.add(list.get(i));
            }
            else if (list.get(i) % 3 == 0) {
                even_odd.add(list.get(i));
            }
            else if (list.get(i) % 2 == 0) {
                even.add(list.get(i));
            }

            else odd.add(list.get(i));
        }
        printList(even_odd);
        printList(even);
        printList(odd);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
