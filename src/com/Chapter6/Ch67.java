package com.Chapter6;

import java.util.stream.IntStream;

public class Ch67 {

    static int sum = 0;

    public static int oddSum(int n) {

        int base = 1;

            if (n % 2 == 0) {
                oddSum(n - 1);
            } else {
                sum = sum + n;
                System.out.print(n + " ");
                if (n <= 1) {
                    return 1;
                } else {
                    oddSum(n - 1);
                }
            }
            return 1;
    }


    public static void main(String[] args) {

        System.out.println("Displaying all odd numbers between 1 and input:");
        oddSum(10);
        System.out.println();
        System.out.println("The sum of all odds is " + sum);
    }
}