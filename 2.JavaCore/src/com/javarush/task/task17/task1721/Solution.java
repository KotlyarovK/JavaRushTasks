package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        Solution solution = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile1;
        String nameFile2;
        String tmp;

        try {
            nameFile1 = reader.readLine();
            nameFile2 = reader.readLine();
            BufferedReader readFile1 = new BufferedReader(new FileReader(nameFile1));
            BufferedReader readFile2 = new BufferedReader(new FileReader(nameFile2));
            // first file
            while ((tmp = readFile1.readLine()) != null) {
                allLines.add(tmp);
            }
            //second file
            while ((tmp = readFile2.readLine()) != null) {
                forRemoveLines.add(tmp);
            }

            reader.close();
            readFile1.close();
            readFile2.close();

            solution.joinData();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void joinData () throws IOException {

        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
