// Created by Jon Brooks on Aug 22

import java.util.Scanner;

public class MyProgram {

    // Given two int values, return their sum. 
    // Unless the two values are the same, 
    // then return double their sum.
    static int sumDouble(int a, int b) {
        
        int c = a + b;

        if (a == b) {
            return c * 2;
        }

        return c;
    }

    public static void main(String args[]) {
        System.out.println(sumDouble(3, 3));
        System.out.println(sumDouble(3, 5));
        System.out.println(sumDouble(2, 7));
    }
}