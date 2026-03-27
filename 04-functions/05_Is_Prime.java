/* 7. Define a method to find out if a number is prime or not. */

import java.util.Scanner;

class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }

        scanner.close();
    }

    static boolean isPrime(int n) {        
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}