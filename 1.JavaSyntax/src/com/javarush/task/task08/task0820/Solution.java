package com.javarush.task.task08.task0820;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код
        HashSet<Cat> result = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            result.add(new Cat());
        }
        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        HashSet<Dog> result = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            result.add(new Dog());
        }
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> all = new HashSet<>();
        all.addAll(cats);
        all.addAll(dogs);
        return all;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        Set<Object> all = new HashSet<>(pets);
        for (Object obj : all) {
           pets.removeAll(cats);
        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object obj : pets) {
            System.out.println(obj);
        }
    }

    //напишите тут ваш код
    public static class Cat {

    }

    public static class Dog {

    }
}
