/* 9. Write a program to print the factorial of a number by defining a method named 'Factorial'. */

import java.util.Scanner;

class factorialRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any integer: ");
        int num = scanner.nextInt();

        System.out.println("Factorial of " + num + " is " + Factorial(num));

        scanner.close();
    }   

    static int Factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
