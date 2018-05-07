package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        int lenID = 8;
        int lenproductName = 30;
        int lenprice = 8;
        int lequantity = 4;

        String productName = (args[1].length()<=30)?args[1]:args[1].substring(0,29);
        float price = Float.parseFloat((args[2].length()<=8)?args[2]:args[2].substring(0,6));
        int quantity = Integer.parseInt((args[3].length()<=4)?args[3]:args[3].substring(0,3));

        String res = "\n";
        String tmp;
        int maxID = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();
        BufferedReader fin = new BufferedReader(new FileReader(nameFile));
        switch (args[0]) {
            case ("-c"):
                while ((tmp = fin.readLine()) != null) {
                    int currID = Integer.parseInt(tmp.substring(0, 8).replace(" ", ""));
                    if (currID > maxID) maxID = currID;
                }
                fin.close();

                BufferedWriter writer = new BufferedWriter(new FileWriter(nameFile, true));
                res += ++maxID;
                for(int i = String.valueOf(maxID).length(); i < lenID; i++) res = res+" ";
                res += productName;
                for(int i = productName.length(); i < lenproductName; i++) res = res+" ";
                res += price;
                for(int i = String.valueOf(price).length(); i < lenprice; i++) res = res+" ";
                res += quantity;
                for(int i = String.valueOf(quantity).length(); i < lequantity; i++) res = res+" ";
                writer.write(res);
                writer.close();

                break;
        }
    }
}
