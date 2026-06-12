package PaymentGatewaySystem;

import java.util.UUID;

public abstract class Payment {

    protected double amount;
    protected String transactionId;

    public Payment(double amount){
        this.amount=amount;
        this.transactionId= generateTransactionId();
    }

    public abstract void processPayment();

    private String generateTransactionId() {
        return UUID.randomUUID().toString();
    }

}
