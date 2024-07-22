package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        System.out.println("\nChild Call Start");
        publicValue++;
        protectedValue++;
        // defaultValue++;
        // privateValue++;

        publicMethod();
        protectedMethod();
        // defaultMethod();
        // privateMethod();

        printParent();
        System.out.println("Child Call End\n");
    }
}
