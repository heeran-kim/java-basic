package poly.ex.pay0;

public class DefaultPay implements Pay {
    // null object pattern
    @Override
    public boolean pay(int amount) {
        System.out.println("Wrong Payment Option");
        return false;
    }
}
