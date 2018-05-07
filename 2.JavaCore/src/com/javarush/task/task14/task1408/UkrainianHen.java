package com.javarush.task.task14.task1408;

class UkrainianHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 20;
    }

    public String getDescription () {
        String data = super.getDescription() + " Моя страна - Ukraine. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        return data;
    }
}