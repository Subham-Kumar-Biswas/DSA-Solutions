/* 8. Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
 Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail */

import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        double grade = scanner.nextDouble();

        System.out.println("Result = " + gradeCalculator(grade));
        
        scanner.close();
    }

    static String gradeCalculator(double grade) {
        if (grade > 91 && grade < 100) {
            return "AA";
        } else if (grade > 81 && grade < 90) {
            return "AB";
        } else if (grade > 71 && grade < 80) {
            return "BB";
        } else if (grade > 61 && grade < 70) {
            return "BC";
        } else if (grade > 51 && grade < 60) {
            return "CD";
        } else if (grade > 41 && grade < 50) {
            return "DD";
        } else if (grade <= 40) {
            return "Fail!";
        } else {
            return "Invalid input!";
        }
    }
}
