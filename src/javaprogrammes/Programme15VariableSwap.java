package javaprogrammes;

/**
 * Write a Java program to swap two variables.
 */
public class Programme15VariableSwap {
    public static void main(String[] args) {
        int a = 1; //Declare original variables
        int b = 2;
        System.out.println("Before swapping");
        System.out.println("a = " + a);
        System.out.println("b= " + b);

        int temp = a; //Temporary variable
        a = b; //Swap the values
        b = temp;

        System.out.println("After swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b); //Calling value into print statement using concatenation

    }
}
