package com.javarush.task.task14.task1408;

class RussianHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 55;
    }

    public String getDescription() {
        String data = super.getDescription() + " Моя страна - Russia. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        return data;
    }
}
