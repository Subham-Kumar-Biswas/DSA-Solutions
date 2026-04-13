/* 2. Take name as input and print a greeting message for that particular name. */

import java.util.Scanner;

class greeting_message {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.printf("Hello, %s! Welcome to my world.", name);

        scanner.close();
    }
}
