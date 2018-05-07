package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> man = new HashMap<>();
        man.put("Доскин", 600);
        man.put("Петров", 700);
        man.put("Сидоров", 500);
        man.put("Ушаков", 300);
        man.put("Пупкин", 125);
        man.put("Соловьев", 800);
        man.put("Соколов", 1000);
        man.put("Иванов", 110);
        man.put("Барабанов", 900);
        man.put("Дорожкин", 650);
        return man;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map); // создаём копию массива
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {          // итератор ?
           if (pair.getValue()<500){
               map.remove(pair.getKey());
           }
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = createMap();
        removeItemFromMap(hashMap);
    }
}