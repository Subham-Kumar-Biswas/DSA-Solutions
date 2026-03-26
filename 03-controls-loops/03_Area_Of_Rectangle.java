/* 3. Area Of Rectangle Program #Basics */

import java.util.Scanner;

class Area_Of_Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = scanner.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = scanner.nextDouble();

        // Formula: length × breadth
        double AreaRectangle = length * breadth;

        System.out.printf("Area of Rectangle is %.2f, length is %.2f and breadth is %.2f", AreaRectangle, length, breadth);

        scanner.close();
    }
}
