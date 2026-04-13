/* 6. Input currency in rupees and output in USD. */

import java.util.Scanner;

class INR_into_USD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rupees (INR): ");
        double rupees = scanner.nextDouble();

        double USD = rupees / 94.12;

        System.out.printf("%f INR = %f USD", rupees, USD);

        scanner.close();
    }
}
