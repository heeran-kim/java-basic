package ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null;
        System.out.println("data = " + data);
        
        data = new Data();
        System.out.println("data = " + data);
        System.out.println("data.testValue = " + data.testValue);
        Data dataTemp = data;
        
        data = null;
        System.out.println("data = " + data);
        System.out.println("dataTemp.testValue = " + dataTemp.testValue);
        // if there is no dataTemp, this object is a garbage instance and cleaned up by GC(Garbage Collection).
    }
}
