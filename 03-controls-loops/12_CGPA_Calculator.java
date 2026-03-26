/* 10. Calculate CGPA Java Program #Intermediate */

import java.util.Scanner;

class CGPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Maths grade (out of 100): ");
        float maths = scanner.nextFloat();

        System.out.print("Java grade (out of 100): ");
        float java = scanner.nextFloat();

        System.out.print("Operating System grade (out of 100): ");
        float OS = scanner.nextFloat();

        System.out.print("Computer Architecture grade (out of 100): ");
        float CA = scanner.nextFloat();

        System.out.print("English grade (out of 100): ");
        float english = scanner.nextFloat();

        float CGPA = (maths + java + OS + CA + english) / 50;

        System.out.printf("CGPA = %.2f", CGPA);

        scanner.close();
    }
}