package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data;
        data = new Data(); // only first assignment is available
        // data = new Data(); // can't

        // values of the final instance can be changeable
        data.value = 10;
        System.out.println("data = " + data);
        System.out.println("data.value = " + data.value);
        data.value = 20;
        System.out.println("data = " + data);
        System.out.println("data.value = " + data.value);
    }
}
