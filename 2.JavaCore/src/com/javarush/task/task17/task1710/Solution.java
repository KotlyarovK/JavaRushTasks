package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

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
                name = args[1];
                sex = args[2];
                birthday = args[3];
                date = format.parse(birthday);
                if (sex.equals("м")) {
                    allPeople.add(Person.createMale(name, date));
                } else if (sex.equals("ж")) {
                    allPeople.add(Person.createFemale(name, date));
                }
                System.out.println(allPeople.size() - 1);
                break;
            case "-u":
                person = allPeople.get(Integer.parseInt(args[1]));
                person.setName(args[2]);
                person.setBirthDay(format.parse(args[4]));
                if (args[3].equals("м")) person.setSex(Sex.MALE);
                else if (args[3].equals("ж")) person.setSex(Sex.FEMALE);
                allPeople.set(Integer.parseInt(args[1]), person);
                break;
            case "-d":
                person = allPeople.get(Integer.parseInt(args[1]));
                person.setName(null);
                person.setBirthDay(null);
                person.setSex(null);
                allPeople.set(Integer.parseInt(args[1]), person);
                break;
            case "-i":
                index = Integer.parseInt(args[1]);
                name = allPeople.get(index).getName();;
                Sex tmp = allPeople.get(index).getSex();
                date = allPeople.get(index).getBirthDay();
                System.out.print(name);
                if (tmp.equals(Sex.MALE)) System.out.print(" м ");
                else System.out.print( " ж ");
                SimpleDateFormat newFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                System.out.println(newFormat.format(date));
                break;
        }


        //      SimpleDateFormat newFormat = new SimpleDateFormat("dd-MMM-yyyy");
        //     Date date = format.parse(birthday);
        //   format.applyPattern("dd-MMM-yyyy");
        //   System.out.println(format.format(date));

    }
}
