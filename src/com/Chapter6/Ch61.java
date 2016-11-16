package com.Chapter6;

public class Ch61 {

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
        //nothing happens - no data is saved
    }

    public static void main(String[] args) {
        System.out.println("boo!" + 7);
        //("boo!" + 7) works
        //("boo!")  + 7 returns an error - can't use + in a void method
    }
}