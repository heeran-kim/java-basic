package poly.basic;

public class Child extends Parent {

    public void childMethod() {
        System.out.println("Child.childMethod");
    }

    @Override
    public void sameNameMethod() {
        System.out.println("Child.sameNameMethod");
    }
}
