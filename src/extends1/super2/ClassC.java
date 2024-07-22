package extends1.super2;

public class ClassC extends ClassB {

    public ClassC(int value1, int value2) {
        super(value1, value2);
        System.out.println("Class C Constructor with 2 Values");
    }

    public ClassC(int value) {
        // super(value);
        // or
        this(value, 0);
        // to overload, super can be used the final destination constructor of this class.
        System.out.println("Class C Constructor with a Value");
    }

    public ClassC() {
        // super();
        // optional if the parent class has a default constructor
        // or no constructor at all
        // (in this case, the default constructor is automatically provided by the compiler)
        System.out.println("Class C Constructor");
    }
}
