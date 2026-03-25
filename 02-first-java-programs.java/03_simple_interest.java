/* 3. Write a program to input principal, time, and rate (P, T, R) from the user and
find Simple Interest. */

import java.util.Scanner;

class simple_interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principle: ");
        double principle = scanner.nextDouble();

        System.out.print("Enter Rate: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();

        double SI = (principle * rate * time) / 100;
        System.out.printf("Simple Interest: %.2f", SI);

        scanner.close();
    }
}
