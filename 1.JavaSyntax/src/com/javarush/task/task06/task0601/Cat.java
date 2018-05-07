package com.javarush.task.task06.task0601;

/* 
Метод finalize класса Cat
*/

public class Cat {
    //напишите тут ваш код
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat = null;
    }

    protected void finalize() throws Throwable {
        System.out.println("abyfl");
    }
}
