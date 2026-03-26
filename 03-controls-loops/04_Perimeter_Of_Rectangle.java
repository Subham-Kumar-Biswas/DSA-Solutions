/* 11. Perimeter Of Rectangle #Basics */

import java.util.Scanner;

class Perimeter_Of_Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = scanner.nextDouble();

        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        // Formula: 2 (length + width)
        double PerimeterRectangle = 2 * (length + width);

        System.out.printf("Perimeter of Rectangle is %.2f, length is %.2f and width is %.2f", PerimeterRectangle, length, width);

        scanner.close();
    }
}