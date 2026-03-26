/* 1. Factorial Program In Java #intermediate */

import java.util.Scanner;

class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your number: ");
        int num = scanner.nextInt();
        int factorial = 1;
        int i = 1;

        while (i <= num) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial: " + factorial);

        scanner.close();
    }
}
