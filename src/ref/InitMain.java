package ref;

public class InitMain {

    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("data.value1 = " + data.value1);
        System.out.println("data.value2 = " + data.value2);
        System.out.println("data.valueArray = " + data.valueArray); // reference type w/o initialisation has null value at first.
        
        /*int a;
        System.out.println("a = " + a);*/
    }
}
