// Superclass
class Animal {
    void makeSound() {
        System.out.println("Animal makes a generic sound.");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    // Override the makeSound method to provide a specific implementation for Dog
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        // Create an instance of the Animal class
        Animal animal = new Animal();
        animal.makeSound(); // Calls the superclass method

        // Create an instance of the Dog class
        Dog dog = new Dog();
        dog.makeSound(); // Calls the overridden method in Dog
    }
}
