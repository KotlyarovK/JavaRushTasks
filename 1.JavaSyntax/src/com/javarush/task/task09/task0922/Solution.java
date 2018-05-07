package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String s = reader.readLine();
        String oldDateString = reader.readLine();
        SimpleDateFormat oldDateFormat = new SimpleDateFormat("MM/dd/yyyy", Locale.getDefault());
        SimpleDateFormat newDateFormat = new SimpleDateFormat("MMM dd, yyyy",Locale.ENGLISH);
        Date date = oldDateFormat.parse(oldDateString);
        String result = newDateFormat.format(date).toUpperCase();
        System.out.println(result);
    }
}
