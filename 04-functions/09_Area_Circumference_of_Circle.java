/* 6. Write a program to print the circumference and area of a circle of radius entered by user by defining your own method. */

import java.util.Scanner;

class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        System.out.println("Area: " + area(radius));
        System.out.println("Circumference: " + circumference(radius));

        scanner.close();
    }

    static double area(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }

    static double circumference(double radius){
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }
}
