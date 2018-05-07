package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int left, top, width, height;


    public void initialize(int height, int width){
        this.width = width;
        this.height = height;
    }
    public void initialize(int width){
        this.width = width;
        this.height = width;
    }

    public void initialize(int height, int width, int left, int top){
        this.width = width;
        this.height = height;
        this.left = left;
        this.top =top;
    }

    public void initialize(int height, int left, int top){
        this.width = height;
        this.height = height;
        this.left = left;
        this.top =top;
    }





    public static void main(String[] args) {

    }
}
