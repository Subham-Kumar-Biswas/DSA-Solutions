/* 25. Take integer inputs till the user enters 0 and print the largest number from all. #Basic */

import java.util.Scanner;

class Largest_Till_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double largest = 0;

        System.out.print("Enter integers to find largest. Enter 0 to print largest number: ");

        while (true) {
            if (scanner.hasNextDouble()) {
                double n = scanner.nextDouble();

                if (n == 0) {
                    break;
                } 
                
                if (largest < n) {
                    largest = n;
                }
                System.out.print("Enter next value: ");
            
            } else {
                System.out.println("Enter a double value. Try again.");
            }
        }

        System.out.println("Largest = " + largest);
        
        scanner.close();
    }
}
