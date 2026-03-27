/* 14. Write a function that returns the sum of first n natural numbers. */

import java.util.Scanner;

class SumOfFirstN{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any integer: ");
        int num = scanner.nextInt();

        System.out.println("Sum of first " + num + " is " + sumOfFirstN(num));

        scanner.close();
    }

    static int sumOfFirstN(int n) {
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
