class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

// Subclass inheriting from Animal
class Mammal extends Animal {
    void breathe() {
        System.out.println("Mammal is breathing.");
    }
}

// Subclass inheriting from Mammal
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        // Create an instance of the Animal class
        Animal animal = new Animal();
        animal.eat();

        // Create an instance of the Mammal class
        Mammal mammal = new Mammal();
        mammal.eat();
        mammal.breathe();

        // Create an instance of the Dog class
        Dog dog = new Dog();
        dog.eat();
        dog.breathe();
        dog.bark();
    }
}
