package poly.basic;

public class CastingMain2 {

    public static void main(String[] args) {
        int value;
        
        System.out.println("without casting: can't access to child class");
        Parent poly = new Child();
        poly.parentMethod();
        poly.sameNameMethod();
        // poly.childMethod();
        // poly.setValue();
        // value = poly.getValue();

        System.out.println();

        System.out.println("with down casting: can access to child class");
        Child polyChild = (Child) poly; // down casting causes warning
        polyChild.childMethod();
        polyChild.setValue(1);
        value =  polyChild.getValue();
        System.out.println("value = " + value);

        System.out.println();
        
        System.out.println("temporarily down casting: can access to child class without creating a new child value");
        ((Child) poly).childMethod();
        // (Child) poly.childMethod() // Need to use parenthesis because of that '.' prior to '()'
        ((Child) poly).setValue(2);
        value = ((Child) poly).getValue();
        System.out.println("value = " + value);
    }
}
