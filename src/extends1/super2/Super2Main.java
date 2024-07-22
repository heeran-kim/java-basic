package extends1.super2;

public class Super2Main {

    public static void main(String[] args) {
        System.out.println("Class B");
        ClassB classB = new ClassB();

        System.out.println("Class B + 1 Value");
        ClassB classB1 = new ClassB(1);

        System.out.println("Class C");
        ClassC classC = new ClassC();

        System.out.println("Class C + 1 Value");
        ClassC classC1 = new ClassC(1);

        System.out.println("Class C + 2 Values");
        ClassC classC2 = new ClassC(1, 2);
    }
}
