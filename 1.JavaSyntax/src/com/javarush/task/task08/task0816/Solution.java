package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.text.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("MAY 1 1991"));
        map.put("Доскин", new Date("SEPTEMBER 1 1993"));
        map.put("Петров", new Date("JUNE 1 1971"));
        map.put("Сидоров", new Date("JANUARY 1 1999"));
        map.put("Ушаков", new Date("AUGUST 1 1988"));
        map.put("Пупкин", new Date("NOVEMBER 1 1977"));
        map.put("Соловьев", new Date("FEBRUARY 1 1984"));
        map.put("Соколов", new Date("DECEMBER 1 1983"));
        map.put("Иванов", new Date("MARCH 1 1973"));
        map.put("Барабанов", new Date("JULY 1 1970"));
        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        HashMap<String, Date> mapRem = new HashMap<String, Date>();
        int month;
        for (HashMap.Entry<String, Date> pair : map.entrySet()) {
            SimpleDateFormat formatForDateNow = new SimpleDateFormat("MM");
            month = Integer.parseInt(formatForDateNow.format(pair.getValue()));
            if (month > 5 && month < 9) {
                map.remove(pair.getKey());
                removeAllSummerPeople(map);
                return;
            }
        }
    }

    public static void main(String[] args) {
        HashMap man = createMap();
        removeAllSummerPeople(man);
    }
}
