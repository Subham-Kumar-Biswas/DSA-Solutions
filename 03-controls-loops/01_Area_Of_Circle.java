/* 1. Area Of Circle Java Program #Basic */

import java.util.Scanner;

class Area_Of_Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter the value of radius: ");
        double radius = scanner.nextDouble();

        // Formula: Area = πr²
        double AreaCircle = Math.PI * radius * radius; 

        System.out.printf("Area of circle is %.2f and radius is %.2f", AreaCircle, radius);

        scanner.close();
    }
}