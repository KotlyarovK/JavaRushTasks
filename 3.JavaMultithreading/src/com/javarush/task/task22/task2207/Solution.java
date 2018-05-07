package com.javarush.task.task22.task2207;

import javafx.print.Collation;

import java.io.*;
import java.util.*;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> hashMap = new HashMap<String, String>();
        ArrayList<String> list = new ArrayList<String>();
        String tmp;
        try (BufferedReader rf = new BufferedReader(new FileReader(reader.readLine()))) {
            while ((tmp = rf.readLine()) != null) {
                String[] arrWords = tmp.split(" ");
                for (String s: arrWords) {
                    list.add(s);
                }
            }
        }


        for (int i = 0; i < list.size(); i++)
        {
            String usual = list.get(i);
            StringBuilder usualreversebuilder = new StringBuilder(usual);
            String usualreverse = usualreversebuilder.reverse().toString();

            {
                for (int j = i + 1; j < list.size(); j++)
                {
                    // 1 если такой ключ уже есть
                    if (hashMap.containsKey(usual)) {continue;}
                    // 2 если такой ключ, только перевернутый, уже есть, т.е повтор
                    if (hashMap.containsKey(usualreverse)) {continue;}


                    StringBuilder sb = new StringBuilder(list.get(j));
                    String reverse = sb.reverse().toString();

                    //2 условие если строка реверсивна следующей
                    if (usual.equals(reverse))
                    {
                        hashMap.put(usual, sb.reverse().toString());
                    }
                }
            }
        }


        for (Map.Entry pair: hashMap.entrySet()) {
            result.add(new Pair((String) pair.getKey(), (String) pair.getValue()));
           // System.out.println(pair);
        }

        for (Pair s: result) {
            System.out.println(s);
        }

    }

    public static class Pair {
        String first;
        String second;

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        public Pair() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
