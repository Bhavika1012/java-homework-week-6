package javaprogrammes;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */


public class Programme5Calculator {

    public static void addition(int a, int b) { //Static method
        int sum = a + b; //Assigning value to sum
        System.out.println("a + b = " + sum); //Calling variable into print statement with concatenation
    }

    public static void subtraction(int a, int b) { //Static method
        int sum = a - b;
        System.out.println("a - b = " + sum);

    }

    public void multiplication(int a, int b) { //instance method
        int sum = a * b;
        System.out.println("a * b = " + sum);
    }

    public void division(int a, int b) { //instance method
        int sum = a / b;
        System.out.println("a / b = " + sum);
    }

    public static void main(String[] args) {

        Programme5Calculator obj = new Programme5Calculator(); //Object crated for instance method calling
        addition(10, 10); //Calling static method and assigning value
        subtraction(11, 3);
        obj.multiplication(2, 4); //Calling instance method and assigning value
        obj.division(2, 4);
    }

}


