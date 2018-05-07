package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private boolean sex;
        private int heigth;
        private int weight;
        private String address;

        public Human(String name, int age, boolean sex, int heigth, int weight, String address) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.heigth = heigth;
            this.weight = weight;
            this.address = address;
        }

        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, int heigth, int weight) {
            this.name = name;
            this.heigth = heigth;
            this.weight = weight;
        }

        public Human(int age, boolean sex, int heigth, int weight) {
            this.age = age;
            this.sex = sex;
            this.heigth = heigth;
            this.weight = weight;
        }

        public Human(String name, boolean sex, String address) {
            this.name = name;
            this.sex = sex;
            this.address = address;
        }

        public Human(boolean sex, String address) {
            this.sex = sex;
            this.address = address;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Human(String name, int age, boolean sex, int heigth, int weight) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.heigth = heigth;
            this.weight = weight;
        }

        public Human(String name) {
            this.name = name;
        }
    }
}
