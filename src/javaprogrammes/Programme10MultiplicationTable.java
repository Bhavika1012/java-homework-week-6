package javaprogrammes;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */
public class Programme10MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Create scanner object
        System.out.println("Enter a number");
        int input = scanner.nextInt(); //Store input value given by user
        System.out.println(input + " x 1 = " + input * 1); //Call input into statement
        System.out.println(input + " x 2 = " + input * 2);
        System.out.println(input + " x 3 = " + input * 3);
        System.out.println(input + " x 4 = " + input * 4);
        System.out.println(input + " x 5 = " + input * 5);
        System.out.println(input + " x 6 = " + input * 6);
        System.out.println(input + " x 7 = " + input * 7);
        System.out.println(input + " x 8 = " + input * 8);
        System.out.println(input + " x 9 = " + input * 9);
        System.out.println(input + " x 10 = " + input * 10);
        scanner.close();


    }


}

