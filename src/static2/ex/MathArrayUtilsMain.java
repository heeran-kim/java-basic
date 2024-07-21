package static2.ex;

import static static2.ex.MathArrayUtils.*;

public class MathArrayUtilsMain {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        System.out.println("sum = " + getSum(intArray));
        System.out.println("average = " + getAverage(intArray));
        System.out.println("min = " + getMin(intArray));
        System.out.println("max = " + getMax(intArray));

        // MathArrayUtils mathArrayUtils = new MathArrayUtils(); // can't make any instance
    }
}
