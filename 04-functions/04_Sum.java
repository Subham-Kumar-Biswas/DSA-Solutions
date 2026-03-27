/* 4. Write a program to print the sum of two numbers entered by user by defining your own method. */

import java.util.Scanner;

class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));

        scanner.close();
    }

    static double add(double a, double b) {
        double sum = a + b;
        return sum;
    }
}