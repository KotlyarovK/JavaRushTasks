package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("petya", 23, "street1");
        Man man2 = new Man("vasya", 21, "street2");
        Woman Woman1 = new Woman("masha", 22, "street1");
        Woman Woman2 = new Woman("jula", 20, "street2");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(Woman1.name + " " + Woman1.age + " " + Woman1.address);
        System.out.println(Woman2.name + " " + Woman2.age + " " + Woman2.address);
    }


    //напишите тут ваш код
    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}