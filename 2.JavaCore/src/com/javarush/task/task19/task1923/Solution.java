package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) return;
        BufferedReader fileIn = new BufferedReader(new FileReader(args[0]));
        BufferedWriter fileOut = new BufferedWriter(new FileWriter(args[1]));
        String str;
        while ((str = fileIn.readLine()) != null) {
            String[] bufferWord = str.split(" ");
            for (int i = 0; i < bufferWord.length; i++) {
                for (int j = 0; j < bufferWord[i].length(); j++) {
                    char symb = bufferWord[i].charAt(j);
                    if(Character.isDigit(symb)) {
                        fileOut.write(bufferWord[i] + " ");
                        break;
                    }
                }
            }
        }
        fileIn.close();
        fileOut.close();
    }
}
