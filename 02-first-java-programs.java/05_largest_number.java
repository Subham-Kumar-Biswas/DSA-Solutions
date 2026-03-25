/* 5. Take 2 numbers as input and print the largest number. */

import java.util.Scanner;

class largest_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter second number: ");
        float num2 = scanner.nextFloat();

        if (num1 > num2) {
            System.out.printf("%.2f is greater than %.2f", num1, num2);
        } else if (num1 < num2) {
            System.out.printf("%.2f is greater than %.2f", num2, num1);

        } else {
            System.out.println("Numbers are equal");
        }

        scanner.close();
    }
}
