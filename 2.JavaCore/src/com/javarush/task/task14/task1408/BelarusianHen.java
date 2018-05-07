package com.javarush.task.task14.task1408;

class BelarusianHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 40;
    }

    public String getDescription () {
        String data = super.getDescription() + " Моя страна - Belarus. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        return data;
    }
}