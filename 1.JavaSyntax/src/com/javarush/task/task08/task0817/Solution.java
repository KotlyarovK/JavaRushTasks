package com.javarush.task.task08.task0817;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<String, String>(map); // создаём копию массива
        for (Map.Entry<String, String> pair : copy.entrySet()) {          // итератор ?
            int freqeuncy = Collections.frequency(copy.values(), pair.getValue());  // применяем метод Collections.frequency, находит повторения в виде числа > 1
            if (freqeuncy > 1) {
                removeItemFromMapByValue(map, pair.getValue()); // если такие имеются то передаём в метод для удаления.
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
