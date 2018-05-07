package com.javarush.task.task14.task1419;

import sun.misc.Unsafe;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();


        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            exceptions.get(1000);

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
           Integer num = null;
           num.hashCode();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object obj = new java.util.Date();
            Integer int1 = (Integer) obj;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("fdsf")));
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int i = 0;
            i = Integer.parseInt("fsdf");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int a = -10;
            int b = -1000;
            int[] asd = new int[a + b];
        } catch (NegativeArraySizeException e7) {
            exceptions.add(e7);
        }
        try
        {
            Object szStr[] = new String[10];
            szStr[0] = new Character('*');
        }catch (Exception e) {
            exceptions.add(e);
        }



        try
        {
            String szShortString = "123";
            char chr = szShortString.charAt(10);
        }catch (Exception e) {
            exceptions.add(e);
        }


        try
        {
            throw new IllegalArgumentException("fdsf");
        }catch (Exception e) {
            exceptions.add(e);
        }




        //напишите тут ваш код

    }
}
