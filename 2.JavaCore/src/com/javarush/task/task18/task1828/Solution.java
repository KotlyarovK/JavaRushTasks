package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        int lenID = 8;
        int lenproductName = 30;
        int lenprice = 8;
        int lequantity = 4;
        ArrayList<String> list = new ArrayList<String>();
        String ID;

        String res = "";
        String tmp;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();
        BufferedReader fin = new BufferedReader(new FileReader(nameFile));
        switch (args[0]) {
            case ("-u"):
                while ((tmp = fin.readLine()) != null) {
                  list.add(tmp);
                }
                fin.close();
                ID = args[1];
                String productName = (args[2].length()<=30)?args[2]:args[2].substring(0,29);
                float price = Float.parseFloat((args[3].length()<=8)?args[3]:args[3].substring(0,6));
                int quantity = Integer.parseInt((args[4].length()<=4)?args[4]:args[5].substring(0,3));

                res += ID;
                for(int i = String.valueOf(ID).length(); i < lenID; i++) res = res+" ";
                res += productName;
                for(int i = productName.length(); i < lenproductName; i++) res = res+" ";
                res += price;
                for(int i = String.valueOf(price).length(); i < lenprice; i++) res = res+" ";
                res += quantity;
                for(int i = String.valueOf(quantity).length(); i < lequantity; i++) res = res+" ";

                for (int i = 0; i < list.size(); i++) {
                    String currID = list.get(i).substring(0, 8).replace(" ", "");
                    if (currID.equals(ID)) {
                        list.set(i, res);
                    }
                }

               // BufferedWriter writer1 = new BufferedWriter(new FileWriter(nameFile));

                FileOutputStream writer1 = new FileOutputStream(nameFile);
                for (String s : list) {
                    writer1.write(s.getBytes());
                   // System.out.print(s + "\n");
                    writer1.write(System.lineSeparator().getBytes());
                }
                fin.close();
                writer1.close();
                break;
            case ("-d"):
                while ((tmp = fin.readLine()) != null) {
                    list.add(tmp);
                }
                fin.close();

                ID = args[1];
                BufferedWriter writer2 = new BufferedWriter(new FileWriter(nameFile));

                for (int i = 0; i < list.size(); i++) {
                    String currID = list.get(i).substring(0, 8).replace(" ", "");
                    if (currID.equals(ID)) {
                        list.remove(i);
                    }
                }
                for (String s : list) {
                    writer2.write(s + "\n");
                }
                writer2.close();
                break;
        }

    }
}
