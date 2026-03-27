/* 3. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote. */

import java.util.Scanner;

class IsEligible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        isEligible(age);

        scanner.close();
    }

    static void isEligible(int n) {
        if (n >= 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}