package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int value1, int value2) {
        System.out.println("Class B Constructor with 2 Values");
    }

    public ClassB(int value) {
        super(value); // mandatory if you want to assign a value to the parent class
        System.out.println("Class B Constructor with Value");
    }

    public ClassB() {
        // super(); // optional when it is default constructor
        System.out.println("Class B Constructor");
    }
}
