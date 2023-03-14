package javaprogrammes;

import java.util.Scanner;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class Programme18Mathematics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner object created for user input
        System.out.println("Input first number: ");
        System.out.println("Input second number: ");
        int number1 = scanner.nextInt(); //Created to store user data
        int number2 = scanner.nextInt();

        int addition = number1 + number2; //Variables created for calculations
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;
        int division = number1 / number2;
        int remainder = number1 % number2;

        System.out.println(number1 + " + " + number2 + " = " + addition); // Bring variables into print statment
        System.out.println(number1 + " - " + number2 + " = " + subtraction);
        System.out.println(number1 + " * " + number2 + " = " + multiplication);
        System.out.println(number1 + " / " + number2 + " = " + division);
        System.out.println(number1 + " mod " + number2 + " = " + remainder);

scanner.close();
    }
}
