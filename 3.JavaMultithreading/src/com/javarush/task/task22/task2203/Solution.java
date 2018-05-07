package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null || string.isEmpty()) throw new TooShortStringException();
        int firstSpaceIndex = string.indexOf("\t") + 1;
        char[] araay = string.toCharArray();
        int countTabs = 0;
        int secondTabsIndex = 0;
        for (int i = 0; i < string.length(); i++)
        {
            if (araay[i] == '\t')
            {
                countTabs++;
                if (countTabs == 2)
                {
                    secondTabsIndex = i;
                } else if (countTabs == 5)
                {
                    secondTabsIndex = i;
                    break;
                }
            }
        }
        if (countTabs < 2)
        {
            throw new TooShortStringException();
        }
        return string.substring(firstSpaceIndex, secondTabsIndex);
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
