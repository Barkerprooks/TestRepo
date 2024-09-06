// Created by Jon Brooks on Aug 22
import java.util.Scanner;

public class MyProgram {

    static Scanner scanner = new Scanner(System.in);

    // Implement a program that asks the user for 
    // the number of days. 
    // After that, the program prints the number 
    // of seconds in the given number of days.

    // 1 day = 86400 seconds

    static void challenge1() {
        System.out.print("input days: ");
        int days = scanner.nextInt();
        System.out.println("seconds: " + (days * 86400));
    }

    // Write a program that asks the user 
    // for two numbers. 
    // After this, the program prints the sum of 
    // the numbers given by the user.

    // HINT: When you ask for multiple numbers, 
    // create a separate variable for each:

    static void challenge2() {
        System.out.print("Give first number: ");
        int x = scanner.nextInt();

        System.out.print("Give second number: ");
        int y = scanner.nextInt();

        System.out.println("sum: " + (x + y));
    }

    // Write a program that asks the user for 
    // two numbers and prints their
    // sum, difference, product, and quotient. 

    static void challenge3() {
        
        System.out.print("first number: ");
        int x = scanner.nextInt();

        System.out.print("second number: ");
        int y = scanner.nextInt();

        System.out.println("+: " + (x + y));
        System.out.println("-: " + (x - y));
        System.out.println("*: " + (x * y));
        System.out.println("/: " + (x / y));
    }

    public static void main(String args[]) {
        challenge1();
        challenge2();
        challenge3();
    }

}