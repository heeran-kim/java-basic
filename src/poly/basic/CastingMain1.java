package poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        System.out.println("without casting: can't access to child class");
        Parent poly = new Child();
        poly.parentMethod();
        poly.sameNameMethod();
        // poly.childMethod();

        System.out.println();

        System.out.println("with down casting: can access to child class");
        Child polyChild = (Child) poly; // down casting causes warning
        polyChild.childMethod();

        System.out.println();

        System.out.println("without casting");
        Child child = new Child();
        child.parentMethod();
        child.sameNameMethod();
        child.childMethod();

        System.out.println();

        System.out.println("with up casting: can't access to child class");
        Parent newParent = (Parent) child;
        newParent.parentMethod();
        newParent.sameNameMethod();
    }
}
