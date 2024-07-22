package extends1.ex3;

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
}
