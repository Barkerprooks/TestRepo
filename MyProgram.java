// Created by Jon Brooks on Aug 22
import java.util.Scanner;

public class MyProgram {

    static int y;
    int x;

    public static void addNumbers(Scanner input) {
        System.out.print("enter number 1: ");
        int num1 = input.nextInt();

        System.out.print("enter number 2: ");
        int num2 = input.nextInt();

        System.out.println(num1 + num2);
    }

    public static void subtractNumbers(Scanner input) {
        System.out.print("enter number 1: ");
        int num1 = input.nextInt();

        System.out.print("enter number 2: ");
        int num2 = input.nextInt();

        System.out.println(num1 - num2);
    }

    public static void main(String args[]) {

        while (true) {
            System.out.print("enter your input: ");

            Scanner input = new Scanner(System.in);
            String string = input.nextLine();

            if (string.equals("add")) {
                addNumbers(input);
                continue;
            } else if (string.equals("subtract")) {
                subtractNumbers(input);
                continue;
            } else if (string.equals("exit")) {
                break;
            }

            System.out.println(string);
        }
    }
}