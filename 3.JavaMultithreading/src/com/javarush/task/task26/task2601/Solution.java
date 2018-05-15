package com.javarush.task.task26.task2601;

import java.util.Arrays;
import java.util.Comparator;
/*
Почитать в инете про медиану выборки
*/
public class Solution {

    public static void main(String[] args) {
        Integer[] first = new Integer[]{13, 8, 15, 5, 17};
        Solution.sort(first);
        for (int i = 0; i < first.length; i++) {
//            System.out.println(first[i]);
        }
    }

    public static Integer[] sort(Integer[] array) {
        int median = 0;
        Integer[] copyArray = array;
        Arrays.sort(copyArray);
        if (copyArray.length%2 == 0) {
            int a = copyArray[(copyArray.length/2)-1];
            int b = copyArray[copyArray.length/2];
            median = (a + b)/2;
        } else {
            median = copyArray[copyArray.length/2];
        }

        int finalMedian = median;
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int result = ((Math.abs(o1- finalMedian)) - (Math.abs(o2 - finalMedian)));
                return result == 0 ? o1-o2 : result;
            }
        };
        Arrays.sort(array, comparator);
        //implement logic here
        return array;
    }
}
