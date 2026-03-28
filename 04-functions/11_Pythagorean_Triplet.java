/* 12. Write a function to check if a given triplet is a Pythagorean triplet or not. */

import java.util.Scanner;

class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        System.out.println("Pythagorean Triplet: " + pythagoreanTriplet(num1, num2, num3));

        scanner.close();
    }

    static boolean pythagoreanTriplet(int a, int b, int c) {
        return (a * a + b * b == c * c) ||
               (b * b + c * c == a * a) ||
               (a * a + c * c == b * b) ;
    }
}