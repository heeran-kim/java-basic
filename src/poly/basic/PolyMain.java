package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();
        parent.sameNameMethod();

        System.out.println();
        System.out.println("Child -> Parent");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();
        child.sameNameMethod();

        System.out.println();
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();
        poly.sameNameMethod();
        // Can't directly call any method of child class
        // poly.childMethod(); // cause a compile error.

        System.out.println();
        System.out.println("Parent -> Grandson");
        Parent poly2 = new Grandson();
        poly2.parentMethod();
        poly2.sameNameMethod();

        System.out.println();
        System.out.println("Child -> Parent");
        // Child poly2 = new Parent(); // cause a compile error.
    }
}
