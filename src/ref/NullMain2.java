package ref;

public class NullMain2 {

    public static void main(String[] args) {
        Data data = null;
        data.testValue = 10; // NullPointerException: null + . (dot)
    }
}
