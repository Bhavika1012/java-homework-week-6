package javaprogrammes;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers.
 * <p>
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * <p>
 * Sum of two binary numbers: 101
 */
public class Programme16Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner object created
        System.out.println("Input first binary number");
        String firstBinary = scanner.nextLine(); //Store value

        System.out.println("Input second binary number");
        String secondBinary = scanner.nextLine();
        int number1 = Integer.parseInt(firstBinary, 2); //Converting binary number into decimal
        int number2 = Integer.parseInt(secondBinary, 2);
        int number3 = number1 + number2;
        System.out.println("The sum of two binary numbers is: " + Integer.toBinaryString(number3));
        scanner.close();


    }
}
