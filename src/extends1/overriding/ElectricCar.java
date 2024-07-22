package extends1.overriding;

public class ElectricCar extends Car {
    // A class can have only one parent class in Java
    // to prevent certain issues.
    // For example, if multiple parent classes have methods with the same name
    // It can lead to ambiguity and conflicts.


    public ElectricCar() {
        System.out.println("\n\tElectric Car");
    }

    public void charge() {
        System.out.println("charge");
    }

    @Override // annotation: special comment, optional but recommended
    public void move() {
        System.out.println("Electric car moving");
    }
    // The @Override annotation checks if this method overrides a method in the parent class.
    // If the method does not actually override a method in the parent class, it causes a compile error.
    // This helps catch errors, such as mistyped method names or incorrect method signatures.
}
