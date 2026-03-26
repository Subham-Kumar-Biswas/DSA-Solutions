/* 23. Input a number and print all the factors of that number. #Basics */

import java.util.Scanner;

class factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        System.out.printf("Factors of %d are: ", n);
        int i = 1;
        while (i <= n) {
            int factor = n % i;
            if (factor == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        scanner.close();
    }
}
