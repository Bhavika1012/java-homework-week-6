package javaprogrammes;
/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */

import java.util.Scanner;

public class Programme19UpperLoweConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner object created for user input
        System.out.println("Enter text in uppercase: ");
        String input = scanner.nextLine(); //Storing input in variable
        String upperCase = input.toUpperCase(); //Inbuilt Java method
        System.out.println(upperCase);
        scanner.close();
    }
}
