package access.ex;

public class MaxCounter {

    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        // Validation
        if (!isIncrementable()) {
            System.out.println("Can't do");
            return;
        }

        // Execution
        count++;
    }

    public int getCount() {
        return count;
    }

    private boolean isIncrementable() {
        return count < max;
    }
}
