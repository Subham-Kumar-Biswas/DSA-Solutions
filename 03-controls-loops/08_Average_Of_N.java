/* 3. Calculate Average Of N Numbers */

import java.util.Scanner;

class AverageOfN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers to calculate average. Enter a non-number (like 'x') to finish: ");
        double sum = 0;
        double count = 0;

        while (scanner.hasNextDouble()) {
            double n = scanner.nextDouble();
            sum += n;
            count++;
            System.out.print("Enter next number (or 'x' to calculate): ");
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("Sum = " + sum);
            System.out.println("Count = " + count);
            System.out.print("Average = " + average);
        } else {
            System.out.print("No numbers were entered.");
        }

        scanner.close();
    }
}