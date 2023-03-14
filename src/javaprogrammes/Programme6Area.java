package javaprogrammes;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */
public class Programme6Area {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); //Scanner object
            System.out.print("Enter the radius of the circle: ");
            double radius; //Declare variables
            double area; //Declare variables
            radius = scanner.nextDouble(); //Storing value
            area = Math.PI * radius * radius; //Storing value
            System.out.println("The area of the circle is " + area);
            scanner.close();
        }
    }

