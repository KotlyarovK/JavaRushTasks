package com.javarush.task.task14.task1407;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Player and Dancer
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Person person = null;
        String key;
        while (!(key = reader.readLine()).equals("exit")) {
            if ("player".equals(key)) {
                person = new Player();
            } else if ("dancer".equals(key)) {
                person = new Dancer();
            }
            haveRest(person);
        }
    }

    public static void haveRest(Person person) {
        //напишите тут ваш код
        if (person instanceof Player) {
            person.play();
        } else if (person instanceof Dancer) {
            person.dance();
        }
    }

    interface Person {
        void play();
        void dance();
    }

    static class Player implements Person {
        public void play() {
            System.out.println("playing");
        }

        public void dance() {
        }
    }

        static class Dancer implements Person {
            public void play() { }
            public void dance() {
                System.out.println("dancing");
            }
        }
}
