package com.javarush.task.task12.task1217;

/* 
Лететь, бежать и плыть
*/

public class Solution {
    public static void main(String[] args) {

    }

//add interfaces here - добавь интерфейсы тут
    public interface Fly {
        void hight(String hight);
    }

    public interface Run {
        void speed(int speed);
    }

    public interface Swim {
        void speed(double speed);
    }

}
