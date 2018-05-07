package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandFather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandMother, null);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother,catFather);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catDaughter);
        System.out.println(catSon);
    }

    public static class Cat {
        private String name;
        private Cat parent_mam;
        private Cat parent_dad;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent_mam, Cat parent_dad) {
            this.name = name;
            this.parent_mam = parent_mam;
            this.parent_dad = parent_dad;
        }

        @Override
        public String toString() {
            if (parent_mam == null && parent_dad == null)
                return "Cat name is " + name + ", no mother, no father ";
            else if (parent_mam != null && parent_dad != null)
                return "Cat name is " + name + ", mother is " + parent_mam.name + " father is " + parent_dad.name;
            else if (parent_mam != null && parent_dad == null)
                return "Cat name is " + name + ", mother is " + parent_mam.name + " no father ";
            else
                return "Cat name is " + name + ", no mother " + " father is " + parent_dad.name;
        }
    }

}
