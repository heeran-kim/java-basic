package poly.basic;

// Down casting can cause a runtime error
public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Child(); // Polymorphism: parent1 is actually a Child object
        // Child child1 = parent; // Down casting requires an explicit cast
        Child child1 = (Child) parent1; // parent1 is created as Child, there is memory for Child class
        child1.childMethod();

        Parent parent2 = new Parent(); // parent2 is actually a Parent object
        Child child2 = (Child) parent2; // parent2 is created as Parent, there is no memory for Child class
        child2.childMethod(); // causes a runtime error: java.lang.ClassCastException
    }
}
