/* 2. Define a program to find out whether a given number is even or odd. */

import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any Integer: ");
        int num = scanner.nextInt();

        oddEven(num);

        scanner.close();
    }

    static void oddEven(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}