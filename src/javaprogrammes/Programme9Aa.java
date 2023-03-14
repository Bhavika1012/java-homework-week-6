package javaprogrammes;
/**
 * Write a program to convert the upper case to lower case.
 */

import java.util.Scanner;

public class Programme9Aa {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text in uppercase: ");
        String input = scanner.nextLine(); //Reads the string and stores it in a variable

        //Converts the text to lowercase using inbuilt method
        String output = input.toLowerCase();
        System.out.println("The text in lowercase is: " + output);
        scanner.close();


    }


}
