/* 24. Sum Of A Digits Of Number */

import java.util.Scanner;

class SumOfDigitsOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any Integer: ");
        int num = scanner.nextInt();

        int digit, sum = 0;

        while(num != 0) {
            digit = num % 10;
            sum += digit;
            num /= 10;
        }

        System.out.println("Sum of digits = " + sum);

        scanner.close();
    }
}
