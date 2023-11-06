// Superclass
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    Dog(String name) {
        super(name); // Call the constructor of the superclass
    }

    // Additional method specific to Dog
    void bark() {
        System.out.println(name + " is barking.");
    }
}

public class SingleLevelInheritance{
    public static void main(String[] args) {
        // Create an instance of the superclass Animal
        Animal animal = new Animal("Generic Animal");
        animal.eat();
        animal.sleep();

        // Create an instance of the subclass Dog
        Dog dog = new Dog("Buddy");
        dog.eat();   // Inherited from Animal
        dog.sleep(); // Inherited from Animal
        dog.bark();  // Specific to Dog
    }
}
