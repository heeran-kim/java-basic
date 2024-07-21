package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
    }

    public static int getSum(int[] array) {
        int result = 0;
        for (int i : array) {
            result += i;
        }
        return result;
    }

    public static double getAverage(int[] array) {
        return (double) getSum(array) / array.length;
    }

    public static int getMin(int[] array) {
        int minValue = array[0]; // Integer.MAX_VALUE;
        for (int i : array) {
            // minValue = (i < minValue) ? i : minValue;
            if (i < minValue){
                minValue = i;
            }
        }
        return minValue;
    }

    public static int getMax(int[] array) {
        int maxValue = array[0]; // Integer.MIN_VALUE;
        for (int i : array) {
            // maxValue = (i > maxValue) ? i : maxValue;
            if (i > maxValue){
                maxValue = i;
            }
        }
        return maxValue;
    }
}
