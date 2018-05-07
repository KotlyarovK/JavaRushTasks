package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    public static Hippodrome game;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public void run() {
        for (int j = 0; j < 100; j++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void move() {
        for (int i = 0; i < horses.size(); i++) {
            getHorses().get(i).move();
        }

    }

    public void print() {
        for (int i = 0; i < horses.size(); i++) {
            getHorses().get(i).print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        int horseNumb = 0;
        int maxDistance = 0;
        for (int i = 0; i < horses.size(); i++) {
            if (maxDistance < getHorses().get(i).getDistance()) {
                maxDistance = (int) Math.floor(getHorses().get(i).getDistance());
                horseNumb = i;
            }
        }
        return getHorses().get(horseNumb);
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName()+"!");
    }

    public static void main(String[] args) {

        List<Horse> horses = new ArrayList<Horse>();
        horses.add( new Horse("Liza", 3, 0));
        horses.add(new Horse("Marysa", 3, 0));
        horses.add( new Horse("Lolla", 3, 0));

        Hippodrome.game = new Hippodrome(horses);
        game.run();
        game.printWinner();

    }
}
