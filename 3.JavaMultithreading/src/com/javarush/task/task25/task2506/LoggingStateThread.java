package com.javarush.task.task25.task2506;


public class LoggingStateThread extends Thread{
    private Thread thread;
    private State state;
    public LoggingStateThread(Thread target) {
        this.thread = target;
        setDaemon(true);
    }

    @Override
    public void run() {
        state = thread.getState();
        System.out.println(state);
        while (state != State.TERMINATED) {
            if (state != this.thread.getState())
            {
                state = this.thread.getState();
                System.out.println(state);
            }
        }
    }
}
