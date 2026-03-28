/* 13. Write a function that returns all prime numbers between two given numbers. */

import java.util.Scanner;

class NumberOfPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter beginning number: ");
        int start = scanner.nextInt();

        System.out.print("Enter ending number: ");
        int end = scanner.nextInt();

        System.out.println("Number of prime numbers from " + start + " to " + end + ":");
        numberOfPrimeNumber(start, end);

        scanner.close();
    }

    static void numberOfPrimeNumber(int a, int b) {
        for (int i = a; i <= b ; i++) {
            if (i < 2) {
                continue;
            }

            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }    
            if (isPrime) {
                System.out.print(i + " ");
            }        
        }
    }
}
