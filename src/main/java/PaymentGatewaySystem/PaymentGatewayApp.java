package PaymentGatewaySystem;

import java.util.ArrayList;
import java.util.List;

public class PaymentGatewayApp {

    public static void main(String[] args) {

        List<Payment> payments = new ArrayList<>();

        payments.add(new CreditCard(5000, "123456781234"));
        payments.add(new UPI(2500, "abc@upi"));
        payments.add(new NetBanking(10000, "HDFC Bank"));


        for (Payment payment : payments) {
            payment.processPayment();
        }
    }
}
