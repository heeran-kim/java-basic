package poly.ex3;

public class Pig extends AbstractAnimal {
    // If you forget to override a concrete method,
    // the parent method will be called causing a runtime error.

    // If you use an abstract method in the parent class
    // and forget to override an abstract method,
    // it causes a compile error which is a good thing.

    // if you don't override any method from the parent abstract class,
    // it causes a compile error
    // because the subclass must provide implementations for all abstract methods.
    @Override
    public void sound(){
        System.out.println("oink");
    }

    @Override
    public void move() {
        System.out.println("Cat Move");
    }
}
