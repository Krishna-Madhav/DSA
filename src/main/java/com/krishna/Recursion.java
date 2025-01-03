package com.krishna;

public class Recursion {

    public static void main(String[] args) {

        int result = factorial(10);
        System.out.println(result);
    }

    private static int factorial(int i) {

        if (i > 0)
            return i * factorial(i - 1);

        return 1;
    }
}
