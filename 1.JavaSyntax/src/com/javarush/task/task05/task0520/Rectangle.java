package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {

    int left, top, width, height;


    public Rectangle (int height, int width) {
        this.width = width;
        this.height = height;
    }
    public Rectangle (int width) {
        this.width = width;
        this.height = width;
    }

    public Rectangle (int height, int width, int left, int top) {
        this.width = width;
        this.height = height;
        this.left = left;
        this.top =top;
    }

    public Rectangle (int height, int left, int top) {
        this.width = height;
        this.height = height;
        this.left = left;
        this.top =top;
    }
    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
