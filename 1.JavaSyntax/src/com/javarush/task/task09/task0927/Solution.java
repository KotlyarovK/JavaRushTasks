package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> map = new HashMap<>();
        map.put("Вася", new Cat("Вася"));
        map.put("Боря", new Cat("Боря"));
        map.put("Мося", new Cat("Мося"));
        map.put("Барсик", new Cat("Барсик"));
        map.put("Мурзик", new Cat("Мурзик"));
        map.put("Кося", new Cat("Кося"));
        map.put("Кыся", new Cat("Кыся"));
        map.put("Тишка", new Cat("Тишка"));
        map.put("Кот", new Cat("Кот"));
        map.put("Котан", new Cat("Котан"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        HashSet set = new HashSet();
        for (Map.Entry pair : map.entrySet()){
            set.add(pair.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
