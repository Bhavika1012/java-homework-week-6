package javaprogrammes;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Programme7MetricConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Scanner object for taking in user input
        System.out.println("Enter the temperature value in degree Fahrenheit");
        double F; //Declare variables
        double C; //Declare variables
        F = scan.nextDouble(); //Reads string from user and store it in F
        C = ((F - 32) * 5/9); //Storing Value
        scan.close();
        System.out.println(F + "°F is " + C + "°C");
    }
}
