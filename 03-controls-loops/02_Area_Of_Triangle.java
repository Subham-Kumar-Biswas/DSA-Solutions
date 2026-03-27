/* 2. Area Of Triangle #Basic */

import java.util.Scanner;

class Area_Of_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        // Formula: ½ × base × height
        double AreaTriangle = 0.5 * base * height;

        System.out.printf("Area of Triangle is %.2f, base is %.2f and height is %.2f", AreaTriangle, base, height);

        scanner.close();
    }
}
