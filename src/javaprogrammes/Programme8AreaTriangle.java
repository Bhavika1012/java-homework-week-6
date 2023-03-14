package javaprogrammes;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Programme8AreaTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner object for input data

        System.out.println("Enter height of Triangle");
        double height = scanner.nextDouble(); //Stores the user input into a variable
        System.out.println("Enter base of Triangle");
        double base = scanner.nextDouble();
        double area = 0.5 * base * height; //Calculates the area based on formula and user input
        System.out.println("The area of the Triangle is: " + area);
        scanner.close();
    }
}
