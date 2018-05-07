package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader rf;
        String name = null;
        while (true) {
            try {
                name = reader.readLine();
               rf = new BufferedReader(new FileReader(name));
               rf.close();
            } catch (FileNotFoundException e) {
                System.out.println(name);
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
