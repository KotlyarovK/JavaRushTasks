package com.javarush.task.task04.task0403;

/* 
Как зовут кота?
*/

public class Cat {
    private String name;

    public void setName(String name) {
        //напишите тут ваш код
        this.name = name;
        System.out.println(this.name);

    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Vasily");
    }
}
