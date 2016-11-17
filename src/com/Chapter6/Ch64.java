package com.Chapter6;

public class Ch64 {

    public static double multadd(double a, double b, double c) {

        return (a * b + c);
    }

    public static double expSum(double x) {

        double a = 1.0;
        double b = x * Math.exp(-x);
        double c = Math.sqrt(1 - Math.exp(-x));
        return multadd(a, b, c);
    }

    public static void main(String[] args) {

        double a = 1.0;
        double b = Math.sin(Math.PI / 4);
        double c = Math.cos(Math.PI / 4) / 2;
        double d = Math.log(10);
        double e = Math.log(20);
        double result1 = multadd(a, b, c);
        double result2 = multadd(a, d, e);

        multadd(a, b, c);
        expSum(10);

        System.out.println("The first result of multadd is " + result1);
        System.out.println("The second result of multadd is " + result2);
        System.out.println("ExpSum returns " + expSum(10));
    }
}