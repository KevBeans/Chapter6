package com.Chapter6;

public class Ch67 {

    public static int oddSum(int n) {

        int base = 1;

        if (n % 2 == 0) {
        } else {
            System.out.print(n + " ");
            if (n <= 0) {
                return 1;
            } else {
                oddSum(n - 1);
            }
        }
        return 1;
    }


    public static void main(String[] args) {

        int n = 50;
        oddSum(n);
    }
}