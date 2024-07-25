package poly.ex.pay0;

import java.util.Objects;

public class PayService {

    public void processPay(String option, int amount) {

        boolean result = false;
        System.out.println("Starting payment: option=" + option + ", amount=" + amount);

        Pay pay = PayStore.findPay(option);
        result = pay.pay(amount);

        if (result) {
            System.out.println("Payment Success");
        } else {
            System.out.println("Payment Fail");
        }
    }
}
