package poly.ex.pay0;

public class NaverPay implements Pay {

    @Override
    public boolean pay(int amount) {
        System.out.println("Connecting to Naver Pay System...");
        System.out.println("Trying to pay " + amount);
        return true;
    }
}
