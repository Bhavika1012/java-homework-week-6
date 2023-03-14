package javaprogrammes;

/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Programme3InstanceAndStatic {
    //Declare one instance and one static variable
    int a = 5;
    static int b = 10;


    public void Value() { //Declare one instance method
        System.out.println("Value of a is = " + a);
        System.out.println("Value of b is = " + b);
    }

    //Call both instance and static variables into both instance and static methods inside the print statement
    public static void Value1() {   //Declare one static method
        System.out.println("Value of b is = " + b);
        Programme3InstanceAndStatic obj1 = new Programme3InstanceAndStatic(); //Instance to static so object must be crated
        System.out.println("Value of a is = " + obj1.a);
    }


    public static void main(String[] args) {  //Declare the Main method
        //Call both instance and static methods into the Main method and run the programme.
        Programme3InstanceAndStatic obj2 = new Programme3InstanceAndStatic();  // Object created for instance method calling
        obj2.Value();
        Value1();

    }
}
