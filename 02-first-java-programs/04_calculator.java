/* 4. Take in two numbers and an operator (+, -, *, /) and calculate the value. */

import java.util.Scanner;

class calculator {
    public static void main(String[] args) {
        float result = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter second number: ");
        float num2 = scanner.nextFloat();

        System.out.println("Select your operation:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n");
        System.out.print("Enter your choice: ");
        int operation = scanner.nextInt();

        if (operation == 1) {
            result = num1 + num2;
            System.out.printf("Result: %f", result);
        }

        else if (operation == 2) {
            result = num1 - num2;
            System.out.printf("Result: %f", result);
        }

        else if (operation == 3) {
            result = num1 * num2;
            System.out.printf("Result: %f", result);
        }

        else if (operation == 4) {
            result = num1 / num2;
            System.out.printf("Result: %f", result);
        }

        else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
