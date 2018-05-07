package com.javarush.task.task05.task0510;

/* 
Кошкоинициация

Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес (чужой домашний кот)

*/

public class Cat {
    //напишите тут ваш код
    String name;
    int weight;
    int age;
    String address;
    String color;

    public void initialize (String name){
        this.name = name;
        this.weight = 3;
        this.age = 3;
        this.color = "color";

    }

    public void initialize (String name, int weight, int age ){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "color";

    }

    public void initialize (String name, int age ){
        this.name = name;
        this.weight = 4;
        this.age = age;
        this.color = "color";

    }

    public void initialize (int weight, String color ){

        this.weight = weight;
        this.age = 4;
        this.color = color;

    }

    public void initialize (int weight, String color, String address ){

        this.weight = weight;
        this.age = 5;
        this.color = color;
        this.address = address;
    }


    public static void main(String[] args) {

    }
}
