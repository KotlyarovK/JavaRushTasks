package com.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.List;

/* 
Кроссворд
*/
public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        detectAllWords(crossword, "home", "same", "jjpeop");
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        List<Word> list = new ArrayList<>();
        int[][] districtSearch = new int[][] {
                {0,1},
                {1,1},
                {1,0},
                {1,-1},
                {0,-1},
                {-1,-1},
                {-1,0},
                {-1,1}
        };

        for (String s: words) wordsCount:{
            for (int i = 0; i < crossword.length; i++) {
                for (int k = 0; k < crossword[i].length; k++) {
                    if (s.charAt(0) == crossword[i][k])
                        for (int detect = 0; detect < districtSearch.length; detect++) {
                            int x = k, y = i, count = 1;
                            while (count < s.length()) {
                                x += districtSearch[detect][0];
                                y += districtSearch[detect][1];
                                if (y >= crossword.length || x >= crossword[y].length
                                        || x < 0 || y < 0) break;
                                if (s.charAt(count) != crossword[y][x]) {
                                    break;
                                } else if (count == s.length() - 1) {
                                    Word word = new Word(s);
                                    word.setStartPoint(k, i);
                                    word.setEndPoint(x, y);
                                    list.add(word);
                                    break wordsCount;
                                }
                                count++;
                            }
                        }
                }
            }
        }
        return list;
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
