package com.Chapter6;

public class Ch64 {

    public static double multadd(double a, double b, double c) {
        return (a * b + c);
    }

    public static void main(String[] args) {
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;
        multadd(a, b, c);
        System.out.println("The result is " + multadd(a, b, c));
    }
}