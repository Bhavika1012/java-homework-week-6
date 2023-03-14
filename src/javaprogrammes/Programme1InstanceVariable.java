package javaprogrammes;

/**
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Programme1InstanceVariable {

    int a = 5; //Declare two instance variables
    int b = 10;

    public void InstanceMethod() { //Declare one instance method
        System.out.println(a); //Call both instance variables into the instance method inside the print statement
        System.out.println(b);
    }

    public static void main(String[] args) { //Declare the Main method
        Programme1InstanceVariable obj = new Programme1InstanceVariable(); //Object created for instance method calling
        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.InstanceMethod(); //Instance method into the Main method

    }


}
