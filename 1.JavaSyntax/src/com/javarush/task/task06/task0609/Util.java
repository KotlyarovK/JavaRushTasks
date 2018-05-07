package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/


import static java.lang.Math.pow;


public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        double distanse = Math.sqrt(pow((x2 - x1), 2) +  pow((y2 - y1), 2));

        System.out.println(distanse);
        return distanse;
    }


    public static void main(String[] args) {

       getDistance(-1,3,6,2);

    }
}
