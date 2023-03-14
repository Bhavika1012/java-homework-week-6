package javaprogrammes;

/**
 *Write a Java program to print the area and perimeter of a rectangle.
 *
 * Test Data:
 * Width = 5.5 Height = 8.5
 *
 * Expected Output:
 *
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Programme14AreaPerimeter {
    public static void main(String[] args) {
        double width = 5.6; //Declare variables for Test Data
        double height = 8.5;
        double area = width * height; //Declare formula
        double perimeter = 2*(width + height);
        System.out.println("Area of the rectangle is " + area); //Call variables into print statement using concatenation
        System.out.println("Perimeter of the rectangle is " + perimeter);


    }

}