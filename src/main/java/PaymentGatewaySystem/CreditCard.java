package PaymentGatewaySystem;

public class CreditCard extends Payment {

    private String cardNumber;
    private final double CHARGE_PERCENT =2.0;

    public CreditCard(double amount,String cardNumber){
        super(amount);
        this.cardNumber=cardNumber;
    }

    @Override
    public void processPayment(){
        double charge = amount*CHARGE_PERCENT/100;
        double finalAmount = amount+charge;

        System.out.println("\nProcessing Credit Card Payment");
        System.out.println("Transaction ID: " +transactionId);
        System.out.println("Card Number: XXXX-XXXX-XXXX-" +cardNumber);
        System.out.println("Original Amount: " +amount);
        System.out.println("Transaction Charge: " +charge);
        System.out.println("Final Amount Debited: " +finalAmount);
        System.out.println("Payment Succesfull");

    }
}
