package com.Chapter6;

public class Ch69 {

    public static double power(double x, int n) {

        if Math.pow(x, n) == x * Math.pow(x, n-1) {
            return Math.pow(x, n);
        }
    }

    public static void main(String[] args) {

        double x = 4.0;
        int n = 2;

        power(x, n);
    }
}
