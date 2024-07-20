package ref;

public class MethodChange {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("a = " + a);
        changePrimitive(a);
        System.out.println("a = " + a);

        Data t = new Data();
        t.testValue = 10;
        System.out.println("t.testValue = " + t.testValue);
        System.out.println("t = " + t);
        changeReference(t);
        System.out.println("t.testValue = " + t.testValue);
    }

    static void changePrimitive(int x) {
        x = 20;
    }

    static void changeReference(Data dataX) {
        dataX.testValue = 20;
        System.out.println("dataX = " + dataX);
    }
}
