package extends1.ex2;

public class ElectricCar extends Car {
    // A class can have only one parent class in Java
    // to prevent certain issues.
    // For example, if multiple parent classes have methods with the same name
    // It can lead to ambiguity and conflicts.
    public void charge() {
        System.out.println("charge");
    }

    // The called class is searched first
    // If you call ElectricCar (Child) class then this method is called first
    // even if there is a method with the same name in the parent class.
    // It is kind of "overriding"
    public void move() {
        System.out.println("electric car move");
    }
}
