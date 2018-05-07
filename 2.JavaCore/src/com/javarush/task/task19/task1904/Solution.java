package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String allstr = fileScanner.nextLine();
            String[] str = allstr.split(" ");
            int day = Integer.parseInt(str[3]);
            int month = Integer.parseInt(str[4])-1;
            int year = Integer.parseInt(str[5]);

            GregorianCalendar calendar = new GregorianCalendar(year,month,day);
            Date date =  calendar.getTime();

            Person person = new Person(str[1],str[2],str[0],date);

            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
