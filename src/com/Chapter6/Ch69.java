package com.Chapter6;

public class Ch69 {

    public static double power(double x, int n) {

        if (n == 0) {
            return 1;
        } else {
            if (n > 0) {
                return x * power(x, n - 1);
            } else {
                return (1.0 / power(x, Math.abs(n)));
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("The result is " + power(2, 4));
        System.out.println("The result is " + power(4, 0));
        System.out.println("The result is " + power(2, -2));
    }
}