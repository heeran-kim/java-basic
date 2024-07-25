package poly.diamond;

public class Main {

    public static void main(String[] args) {
        Child child = new Child();

        child.methodA();
        child.methodB();
        child.methodCommon();


        InterfaceA interfaceA = new Child();

        interfaceA.methodA();
        interfaceA.methodCommon();


        InterfaceB interfaceB = new Child();

        interfaceB.methodB();
        interfaceB.methodCommon();
    }
}
