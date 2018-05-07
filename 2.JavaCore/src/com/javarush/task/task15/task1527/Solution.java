package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String mass[];
        String summ = "";
        String tmp = "";
        mass = str.split("");
        for (int i = 0; i < mass.length; i++) {
            if(mass[i].equals("?")) {
                for (int j = i+1; j < mass.length; j++) {
                    if(!mass[j].equals("&") && !mass[j].equals("=")) summ += mass[j];
                    else {
                        summ += " ";
                        if(summ.equals("obj ")){
                            for (int k = j+1; k < mass.length ; k++) {
                                if(!mass[k].equals("&"))
                                    tmp += mass[k];
                                else {
                                    i =j;
                                    break;
                                }
                            }
                        }
                        break;

                    }
                }
            }

            if(mass[i].equals("&")) {
                for (int j = i+1; j < mass.length; j++) {
                    if(!mass[j].equals("&") && !mass[j].equals("=")) summ += mass[j];
                    else {
                        i =j;
                        summ += " ";
                        break;
                    }
                }
            }

            if(mass[i].equals("&")) {
                for (int j = i+1; j < mass.length; j++) {
                    if(!mass[j].equals("&") && !mass[j].equals("=")) summ += mass[j];
                    else {
                        i =j;
                        summ += " ";
                        break;
                    }
                }
            }

        }
        System.out.println(summ);
        try {
            alert(Double.parseDouble(tmp));
        } catch (Exception e) {
            if(!tmp.isEmpty())
            alert(tmp);
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
