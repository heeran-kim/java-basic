package extends1.access;

import extends1.access.child.Child;

public class ExtendsAccessMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.publicValue++;
        // child.protectedValue++;
        // child.defaultValue++;
        // child.privateValue++;

        child.call();

        child.publicMethod();
        // child.protectedMethod();
        // child.defaultMethod();
        // child.privateMethod();

        child.printParent();
    }
}
