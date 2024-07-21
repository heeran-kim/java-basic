package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        staticValue++;
        staticMethod();
        // non-static variable and method cannot be referenced from a static context
        // instanceValue++;
        // instanceMethod();
    }

    public void instanceCall() {
        staticValue++;
        staticMethod();
        instanceValue++;
        instanceMethod();
    }

    public static void staticMethod() {
        System.out.println("static method");
        // non-static variable cannot be referenced from a static context
        // System.out.println("instanceValue = " + instanceValue);
        System.out.println("staticValue = " + staticValue);
    }

    public void instanceMethod() {
        System.out.println("instance method");
        System.out.println("instanceValue = " + instanceValue);
        System.out.println("staticValue = " + staticValue);
    }
}
