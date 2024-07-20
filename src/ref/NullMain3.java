package ref;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigData = new BigData();

        System.out.println("bigData = " + bigData); // address
        System.out.println("bigData.data = " + bigData.data); // null
        System.out.println("bigData.count = " + bigData.count); // 0
        System.out.println("bigData.data.testValue = " + bigData.data.testValue); // null + . (dot) => NullPointerException
    }
}
