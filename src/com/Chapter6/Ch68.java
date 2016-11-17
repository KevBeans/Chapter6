package com.Chapter6;

public class Ch68 {

    public static int ack(int m, int n) {
        if (m < 0 && n < 0) {
            throw new IllegalArgumentException("Values must be positive!");
        } else if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ack(m - 1, 1);
        } else if (m > 0 && n > 0) {
            return ack(m - 1, ack(m, n - 1));
        }
        return ack(m, n);
    }

    public static void main(String[] args) {

        int m = 1;
        int n = 2;

        ack(m, n);
        System.out.println("Ackermann solution: " + ack(m, n));
    }
}