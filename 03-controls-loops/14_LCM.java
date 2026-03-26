/* 20. LCM Of Two Numbers #Intermediate */

import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int OriginalNum1 = num1;
        int OriginalNum2 = num2;

        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        int HCF = num1;

        int LCM = (OriginalNum1 / HCF) * OriginalNum2;

        System.out.println("LCM = " + LCM);

        scanner.close();
    }
}
