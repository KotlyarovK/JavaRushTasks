package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        ByteArrayOutputStream array = new ByteArrayOutputStream();
        PrintStream anotherStream = new PrintStream(array);
        System.setOut(anotherStream);

        testString.printSomething();

        String[] example = array.toString().split(" ");
        int result = 0;
        switch (example[1]) {
            case "+":
                result = Integer.parseInt(example[0]) + Integer.parseInt(example[2]);
                break;
            case "-":
                result = Integer.parseInt(example[0]) - Integer.parseInt(example[2]);
                break;
            case "*":
                result = Integer.parseInt(example[0]) * Integer.parseInt(example[2]);
                break;
        }

        System.setOut(console);

        String s = array.toString();

        System.out.println(s.substring(0, s.length()-2) + " "+result);

    }
    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

