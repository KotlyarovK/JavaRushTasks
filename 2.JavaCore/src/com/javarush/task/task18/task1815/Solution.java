package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements ATableInterface{
        private ATableInterface ata;

        public TableInterfaceWrapper(ATableInterface ata) {
            this.ata = ata;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            ata.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return ata.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            ata.setHeaderText(newHeaderText);
        }
    }

    public interface ATableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}