package javaprogrammes;

/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
//Declare two instance and two static variables
public class Programme4 {
    int a = 5;
    int b = 10;
    static int c = 15;
    static int d = 20;

    //Call all four instance and static variables into instance method inside the print statement
    public void InstanceMethod() { //Declare one instance method
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
        System.out.println("Value of c = " + c);
        System.out.println("Value of d = " + d);

    }

    public static void StaticMethod() { //Declare one static method
        //Call all four variables into static methods inside the print statement
        Programme4 obj1 = new Programme4();
        System.out.println("Value of a = " + obj1.a);
        System.out.println("Value of b = " + obj1.b);
        System.out.println("Value of c = " + c);
        System.out.println("Value of d = " + d);
    }

    public static void main(String[] args) { //Declare the Main method
        //Call both instance and static methods into the Main method and run the programme.
        Programme4 obj2 = new Programme4();  // Object created for instance method calling
        obj2.InstanceMethod();
        StaticMethod();

    }

}
