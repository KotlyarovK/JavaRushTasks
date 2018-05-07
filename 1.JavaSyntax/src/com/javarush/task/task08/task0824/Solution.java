package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import com.sun.org.apache.xml.internal.utils.StringToStringTable;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> children0 = new ArrayList<>();
        Human child1 = new Human("Артем", true, 21,children0);
        Human child2 = new Human("Мария", false, 16, children0);
        Human child3 = new Human("Никита", true, 5, children0);

        ArrayList<Human> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        children.add(child3);

        Human mother = new Human("Ангелина", false, 35, children);
        Human father = new Human("Константин", true, 40, children);

        ArrayList<Human> children1 = new ArrayList<>();
        ArrayList<Human> children2 = new ArrayList<>();
        children1.add(mother);
        children2.add(father);

        Human grandMother1 = new Human("Анна", false, 68, children1);
        Human grandFather1 = new Human("Егор", true, 70, children1);
        Human grandMother2 = new Human("Дуся", false, 69, children2);
        Human grandFather2 = new Human("Николай", true, 70, children2);

        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(grandFather1.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother2.toString());

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
