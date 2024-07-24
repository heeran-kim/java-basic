package poly.ex3;

// Abstract class AbstractAnimal
abstract class AbstractAnimal {
    // If a class contains at least one abstract method,
    // the class itself must be declared as an abstract.
    // This prevents the instantiation of the class
    // and ensures that the abstract method is not called directly.

    // An abstract method does not have a body
    // because it is not meant to be called directly.
    // If an abstract method has a body, it causes a compile error.
    public abstract void sound();

    // A concrete method in the abstract method
    // Concrete methods have a body and can be called directly.
    public void move() {
        System.out.println("Animal Move");
    }
}
