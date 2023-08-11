// Superclass (Parent class)
class Animal1 {
    String name;

    public Animal1(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass (Child class)
class Dog extends Animal {
    public Dog(String name) {
        super(name); // Call the constructor of the superclass
    }

    // Override the makeSound method from the superclass
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    // Additional method specific to Dog class
    public void wagTail() {
        System.out.println("Dog wags its tail");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog dog = new Dog("Buddy");

        // Access methods from the Animal class (inherited)
        System.out.println("Name of the dog: " + dog.name);
        dog.makeSound(); // Call the overridden method in the Dog class

        // Access methods specific to the Dog class
        dog.wagTail();
    }
}
