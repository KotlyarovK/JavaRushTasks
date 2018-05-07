package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

import java.net.CacheRequest;

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int age;
        int weight;
        int strenhth;
        if (this.age > anotherCat.age)
            age = 1;
        else age = 0;
        if (this.weight > anotherCat.weight)
            weight = 1;
        else weight = 0;
        if (this.strength > anotherCat.strength)
            strenhth = 1;
        else strenhth = 0;
        int summ = weight + age + strenhth;
        return summ>2;
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.name="vasya";
        cat1.age = 3;
        cat1.weight = 4;
        cat1.strength = 10;

        cat2.name="borya";
        cat2.age = 6;
        cat2.weight = 5;
        cat2.strength = 11;

        boolean bool1 =  cat1.fight(cat2);
        System.out.println(bool1);

        boolean bool2 =  cat2.fight(cat1);
        System.out.println(bool2);
    }
}
