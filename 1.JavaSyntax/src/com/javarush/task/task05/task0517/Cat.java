package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name) {
        this.name = name;
        this.age = 3;
        this.weight = 3;
        this.color = "blue";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "red";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 3;
        this.color = "orange";
    }

    public Cat(int weight, String color) {
        this.age = 3;
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight, String color, String address) {
        this.age = 3;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
