package javaprogrammes;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 *
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 *
 * Binary number is: 101
 */
public class Programme17DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner object for user input
        System.out.println("Input decimal number");
        int decimal = scanner.nextInt(); //Storing user input into variable

        String binaryNumber = Integer.toBinaryString(decimal); //Converts decimal into binary using built in method
            System.out.println("Binary number is: " + binaryNumber); //Print results using concatenation
            scanner.close();
        }


    }

