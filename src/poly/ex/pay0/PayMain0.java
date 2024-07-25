package poly.ex.pay0;

import java.util.Scanner;

public class PayMain0 {

    public static void main(String[] args) {
        PayService payService = new PayService();

        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);

        //
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Enter a payment option (exit for termination):");
            String option = scanner.nextLine();

            if (option.equals("exit")) {
                System.out.println("Exit the program");
                break;
            }

            System.out.print("Enter amount:");
            int amount = scanner.nextInt();
            scanner.nextLine();
            payService.processPay(option, amount);
        }
    }
}
