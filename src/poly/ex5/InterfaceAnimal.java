package poly.ex5;

public interface InterfaceAnimal {

    // interface is only for polymorphism
    // which means methods are all public abstract
    // so `public abstract` can be deleted. (recommended)
    // public abstract void sound();
    void sound();
    // public abstract void move();
    void move();

    // The difference between an interface and a pure abstract class is:
    // In an interface, all methods must be abstract (restricted).
    // An interface cannot contain any concrete methods.
    // (After Java 8, interface can have a method)
    //
    // In a pure abstract class, methods can be abstract or concrete.
    // However, if a pure abstract class contains concrete methods,
    // it is no longer considered a pure abstract class.
}
