package static1;

public class DataCountMain {
    public static void main(String[] args) {
        System.out.println("Data.count = " + Data.count);
        Data data1 = new Data("A");
        System.out.println("Data.count = " + Data.count);
        Data data2 = new Data("B");
        System.out.println("Data.count = " + Data.count);
        Data data3 = new Data("C");
        System.out.println("Data.count = " + Data.count);
        System.out.println("data3.count = " + data3.count);
        // Not recommended. This may be confused with an instance variable.
    }
 }
