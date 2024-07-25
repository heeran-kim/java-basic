package poly.ex.pay0;

public abstract class PayStore {
    /**
     * When a new payment method implementation is needed,
     * separate the part that changes into a new class.
     * This follows the Open/Closed Principle (OCP),
     * which states that software entities should be open for extension
     * but closed for modification.
     *
     * By abstracting the changeable part with an interface and implementing it in
     * separate classes, we enhance the maintainability and extensibility of the code.
     */
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else {
            return new DefaultPay();
        }
    }
}
