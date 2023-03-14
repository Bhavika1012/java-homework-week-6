package javaprogrammes;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */
public class Programme13Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner for input value
        System.out.println("Enter the first number");
        int number1 = scanner.nextInt(); //Storing user input into number1
        System.out.println("Enter the second number");
        int number2 = scanner.nextInt();
        System.out.println("Enter the third number");
        int number3 = scanner.nextInt();
        scanner.close();
        System.out.println("The average of the numbers given is " + (number1 + number2 + number3) / 3); //Call variables in using concatenation
        scanner.close();

    }
}
