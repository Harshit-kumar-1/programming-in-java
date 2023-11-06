public class StaticExample {
    // Static variable
    static int staticVariable = 10;

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Instance variable
    int instanceVariable;

    // Constructor
    public StaticExample(int instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    public static void main(String[] args) {
        // Accessing the static variable and method using the class name
        System.out.println("Static variable: " + StaticExample.staticVariable);
        StaticExample.staticMethod();

        // Creating instances of the class
        StaticExample obj1 = new StaticExample(5);
        StaticExample obj2 = new StaticExample(8);

        // Accessing instance variables
        System.out.println("Instance variable of obj1: " + obj1.instanceVariable);
        System.out.println("Instance variable of obj2: " + obj2.instanceVariable);

        // Static variable can also be accessed through an instance, but it's not a good practice
        System.out.println("Static variable accessed through obj1: " + obj1.staticVariable);
        System.out.println("Static variable accessed through obj2: " + obj2.staticVariable);

        // Modifying the static variable
        obj1.staticVariable = 20;
        System.out.println("Static variable modified through obj1: " + obj1.staticVariable);
        System.out.println("Static variable modified through obj2: " + obj2.staticVariable);

        // The static variable is shared among all instances, so both obj1 and obj2 see the same value
        System.out.println("Static variable seen by obj2 after modification through obj1: " + obj2.staticVariable);
    }
}
