package com.Chapter6;

public class Ch64 {

    public static double multadd(double a, double b, double c) {
        return (a * b + c);
    }
//FIX THIS FIX THIS FIX THIS FIX THIS FIX THIS
    public static double expSum(double sum) {
        return 1;
    }

    public static void main(String[] args) {
        double a = 1.0;
        double b = Math.sin(Math.PI / 4);
        double c = (Math.cos(Math.PI / 4) / 2);
        multadd(a, b, c);
        System.out.println("The first result is " + multadd(a, b, c));

        System.out.println("The second result is " + multadd(a, b, c));
    }
}