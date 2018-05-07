package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
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
        int count = 1;
        String[] arrStr = array.toString().split("\n");
        System.setOut(console);
        int size = arrStr.length;
        for (int i = 0; i < size; i++) {
            System.out.println(arrStr[i]);
            if (count%2 == 0) {
                System.out.println("JavaRush - курсы Java онлайн");
               // System.out.println(arrStr[i-1]);
            }
            count ++;
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
