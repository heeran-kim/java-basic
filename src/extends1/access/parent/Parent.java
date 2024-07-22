package extends1.access.parent;

public class Parent {

    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("public method");
    }

    protected void protectedMethod() {
        System.out.println("protected method");
    }

    void defaultMethod() {
        System.out.println("default method");
    }

    private void privateMethod() {
        System.out.println("private method");
    }

    public void printParent() {
        System.out.println("\nPrint Parent Start");
        System.out.println("publicValue = " + publicValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("defaultValue = " + defaultValue);
        System.out.println("privateValue = " + privateValue);

        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
        System.out.println("Print Parent End\n");
    }
}
