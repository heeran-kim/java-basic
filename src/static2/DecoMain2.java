package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        System.out.println("  1. static call  ");
        DecoData.staticCall();
        // DecoData.instanceCall();

        System.out.println("  2. instance call  ");
        DecoData decoData = new DecoData();
        decoData.instanceCall();
        decoData.staticCall();
    }
}
