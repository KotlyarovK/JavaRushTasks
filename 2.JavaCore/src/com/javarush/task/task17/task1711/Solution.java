package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
            allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
            allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        Person person = null;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        String name;
        String sex;
        String birthday;
        Date date;
        int index;
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    int countPeople = 0;
                    if ((args.length - 1) % 3 == 0)
                        countPeople = (args.length - 1) / 3;

                        for (int i = 0; i < countPeople; i++) {
                            name = args[i * 3 + 1];
                            birthday = args[i * 3 + 3];
                            sex = args[i * 3 + 2];
                            System.out.println(addPerson(name, sex, birthday));
                        }
                        break;
                    }
                    case "-u":
                        synchronized (allPeople) {
                            int countPeople = 0;
                            if ((args.length - 1) % 4 == 0)
                                countPeople = (args.length - 1) / 4;

                            for (int i = 0; i < countPeople; i++) {
                                index = Integer.parseInt(args[i * 4 + 1]);
                                name = args[i * 4 + 2];
                                birthday = args[i * 4 + 4];
                                sex = args[i * 4 + 3];
                               changePerson(index, name, sex, birthday);
                            }
                            break;
                        }
                    case "-d":
                        synchronized (allPeople) {
                            for (int i = 1; i < args.length; i++) {
                                delPerson(Integer.parseInt(args[i]));
                            }
                            break;
                        }

                    case "-i":
                        synchronized (allPeople) {
                            for (int i = 1; i < args.length; i++) {
                                System.out.println(getPerson(Integer.parseInt(args[i])));
                            }
                            break;
                        }
                }
        }

        public static synchronized String getPerson ( int index){
            String out = "";
            Date date;
            out += allPeople.get(index).getName();
            Sex tmp = allPeople.get(index).getSex();
            date = allPeople.get(index).getBirthDay();
            if (tmp.equals(Sex.MALE)) out += " м ";
            else out += " ж ";
            ;
            SimpleDateFormat newFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            out += newFormat.format(date);
            return out;
        }

        public static synchronized void delPerson ( int index){
            Person person = allPeople.get(index);
            person.setName(null);
            person.setBirthDay(null);
            person.setSex(null);
            allPeople.set(index, person);
        }

        public static synchronized int addPerson (String name, String sex, String birthday) throws ParseException {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            Date date = format.parse(birthday);
            if (sex.equals("м")) allPeople.add(Person.createMale(name, date));
            else if (sex.equals("ж")) allPeople.add(Person.createFemale(name, date));
            return (allPeople.size() - 1);
        }

        public static void changePerson (int index, String name, String sex, String birthday) throws ParseException {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            Person person = allPeople.get(index);
            person.setName(name);
            person.setBirthDay(format.parse(birthday));
            if (sex.equals("м")) person.setSex(Sex.MALE);
            else if (sex.equals("ж")) person.setSex(Sex.FEMALE);
            allPeople.set(index, person);
        }
}
/*
    int countPeople;
        if ((args.length-1) % 3 == 0) {
        countPeople = (args.length - 1) / 3;

        for (int i = 0; i < countPeople; i++) {
        String name = args[i*3+1];
        Date bd = sdfIn.parse(args[i*3+3]);

        if (args[i*3+2].equals("м")) {
        allPeople.add(Person.createMale(name, bd));
                            System.out.println(addPerson(name,sex,birthday));

        System.out.println(allPeople.size()-1);


        } else if (args[i*3+2].equals("ж")) {
        allPeople.add(Person.createFemale(name, bd));
        System.out.println(allPeople.size()-1);
        */