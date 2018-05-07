package com.javarush.task.task14.task1408;

class MoldovanHen extends Hen {

    int getCountOfEggsPerMonth() {
        return 38;
    }

    public String getDescription () {
        String data = super.getDescription() + " Моя страна - Moldova. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        return data;
    }
}
