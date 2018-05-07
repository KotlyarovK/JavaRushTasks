package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        Thread t1 = new Thread(new FirstThread());
        Thread t2 = new Thread(new SecondThread());
        Thread t3 = new Thread(new ThirdThread());
        FourthThread t4 = new FourthThread();
        Thread t5 = new Thread(new FifthThread());
        threads.add(t1);
        threads.add(t2);
        threads.add(t3);
        threads.add(t4);
        threads.add(t5);
    }

    public static void main(String[] args) {
        Thread t4 = threads.get(4);
        t4.start();
    }

    public static class FirstThread implements Runnable {
        @Override
        public void run() {
            while (true) { }
        }
    }

    public static class SecondThread implements Runnable {
        @Override
        public void run() {
            System.out.println("Стартует нить №2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class ThirdThread implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }

        }
    }

    public static class FourthThread extends Thread implements Message {
        @Override
        public void run() {
            while (!isInterrupted()) {}
        }

        @Override
        public void showWarning() {
            interrupt();
        }
    }

    public static class FifthThread implements Runnable {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int summ = 0;
        @Override
        public void run() {
            while (true) {
                try {
                    s = reader.readLine();
                    if (s.equals("N")) break;
                    summ += Integer.parseInt(s);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(summ);
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

