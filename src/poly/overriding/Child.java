package poly.overriding;

public class Child extends Parent {

    public String value = "child"; // member variable cannot be overrided

    @Override
    public void method() {
        System.out.println("Child.method");
    }
}
