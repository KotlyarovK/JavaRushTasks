package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
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
        man.put("Иванов", "Сергей");
        return man;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
