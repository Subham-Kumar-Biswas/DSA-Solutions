/* 5. Define a method that returns the product of two numbers entered by user. */

import java.util.Scanner;

class Product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println(num1 + " x " + num2 + " = " + product(num1, num2));

        scanner.close();
    }

    static double product(double a, double b) {
        double multi = a * b;
        return multi;
    }
}
