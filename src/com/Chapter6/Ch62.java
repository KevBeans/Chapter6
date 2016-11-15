package com.Chapter6;

import java.util.Random;

public class Ch62 {

    public static boolean isDivisible(int n, int m) {
        return n % m == 0;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(24) + 1;
        int m = random.nextInt(6) + 1;
        if (isDivisible(n, m)) {
            System.out.println(n);
            System.out.println(m);
            System.out.println("True");
        } else {
            System.out.println(n);
            System.out.println(m);
            System.out.println("False");
        }
    }
}