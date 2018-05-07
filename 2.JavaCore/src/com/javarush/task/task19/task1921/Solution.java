package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
        String name = "";
        String birthDay = "";

        while (reader.ready()){
            String[] sMass = reader.readLine().split(" ");
            for (int i = 0; i < sMass.length; i++) {
                birthDay = sMass[sMass.length-3] + " " + sMass[sMass.length-2] + " " + sMass[sMass.length-1];
                if (sMass.length == 4){
                    name = sMass[0];
                } else if (sMass.length == 5){
                    name = sMass[0] + " " + sMass[1];
                } else if (sMass.length == 6){
                    name = sMass[0] + " " + sMass[1] + " " + sMass[2];
                }
            }

            PEOPLE.add(new Person(name, simpleDateFormat.parse(birthDay)));
        }
        reader.close();
    }

}