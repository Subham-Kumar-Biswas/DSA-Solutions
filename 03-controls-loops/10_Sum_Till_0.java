/* 24. Take integer inputs till the user enters 0 and print the sum of all numbers #Basic */

import java.util.Scanner;

class Sum_Till_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;

        System.out.print("Enter any number. Enter 0 to calculate: ");

        while (true) {
            if (scanner.hasNextDouble()) {
                double n = scanner.nextDouble();

                if (n == 0) {
                    break;
                }
            sum += n;

            System.out.print("Enter next number: ");

            
            } else {
                System.out.print("You entered a non-integer character. Please try again.");
            }

        }

        System.out.println("Sum = " + sum);

        scanner.close();
    }
}
