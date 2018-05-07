package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> man = new HashMap<>();
        man.put("Доскин", "Иван");
        man.put("Петров", "Станислав");
        man.put("Сидоров", "Андрей");
        man.put("Ушаков", "Антон");
        man.put("Пупкин", "Петр");
        man.put("Соловьев", "Андрей");
        man.put("Соколов", "Аркадий");
        man.put("Иванов", "Игорь");
        man.put("Барабанов", "Геннадий");
        man.put("Дорожкин", "Сергей");
        return man;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (HashMap.Entry<String, String> pair : map.entrySet()){
            if (pair.getValue().equals(name)) count++;
        }

        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (HashMap.Entry<String, String> pair : map.entrySet()){
            if (pair.getKey().equals(lastName)) count++;
        }
        return count;

    }

    public static void main(String[] args) {
        HashMap<String,String> persona = createMap();
        getCountTheSameFirstName(persona, "Иванов");
        getCountTheSameLastName(persona, "Иван");
    }
}
