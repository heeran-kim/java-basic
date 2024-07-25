package poly.ex.pay0;

public class KakaoPay implements Pay {

    @Override
    public boolean pay(int amount) {
        System.out.println("Connecting to Kakao Pay System...");
        System.out.println("Trying to pay " + amount);
        return true;
    }
}
