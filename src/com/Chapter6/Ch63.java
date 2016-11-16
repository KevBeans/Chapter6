package com.Chapter6;

public class Ch63 {

    public static boolean isTriangle(int cathetus1, int cathetus2, int hypotenuse) {
        if (hypotenuse < cathetus1 + cathetus2) {
            System.out.println("True. \nIt is a triangle.");
            return true;
        } else {
            System.out.println("False. \nIt is not a triangle.");
            return false;
        }
    }

    public static void main(String[] args) {
        int cathetus1 = 7;
        int cathetus2 = 5;
        int hypotenuse = 10;
        isTriangle(cathetus1, cathetus2, hypotenuse);
    }
}