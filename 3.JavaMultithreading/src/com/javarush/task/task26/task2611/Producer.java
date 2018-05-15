package com.javarush.task.task26.task2611;

import java.util.concurrent.ConcurrentHashMap;

public class Producer implements Runnable {
    private ConcurrentHashMap<String, String> map;
    public Producer(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        int count = 1;
        Thread currentThread = Thread.currentThread();
        while (!currentThread.isInterrupted()) {
            try {
                String key = String.valueOf(count);
                String value = "Some text for " + count;
                map.put(key, value);
                count++;
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(currentThread.getName() + " thread was terminated");
            }
        }
    }
}
