package com.javarush.task.task20.task2025;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/*
Алгоритмы-числа
*/
public class Solution {
    private static List<Integer> replica = new ArrayList<>();

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long[] array = getNumbers(1234567890L);
        long end = System.currentTimeMillis() - start;
        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        SimpleDateFormat sdf = new SimpleDateFormat("ss.SSS");
        System.out.println("Time = " + sdf.format(new Date(end)));
        System.out.println("Memory = " + memory / 1048576);

        Set<Long> armstrongNumbers = new TreeSet<>(Arrays.stream(array).boxed().collect(Collectors.toSet()));
        for (long a : armstrongNumbers) {
            if (a != 0)
                System.out.print(a + " ");
        }
    }

    public static long[] getNumbers(long N) {
        if (N <= 0) return null;
        Set<Long> set = new TreeSet<>();
        String[] s;
        int m;
        for (long i = N - 1; i >= 0; i--) {
            long n = 0;
            s = String.valueOf(i).split("");
            for (int j = 0; j < s.length; j++) {
                int t = 1;
                int a = Integer.parseInt(s[j]);
                for (int f = 0; f < s.length; f++) {
                    t *= a;
                }
                n += t;
            }
            if (n < N && n == i) set.add(n);
        }
        int g = 0;
        long[] result = new long[set.size()];
        for (Long aSet : set) {
            result[g] = aSet;
            g++;
        }
        return result;
    }
}