package PaymentGatewaySystem;

public class UPI extends Payment{

    private String upiId;
    private  final double CHARGE_PERCENT=0.0;

    public UPI(double amount, String upiId){
        super(amount);
        this.upiId=upiId;
    }

    @Override
    public void processPayment(){
         double charge=amount*CHARGE_PERCENT/100;
         double finalAmount =amount+charge;

        System.out.println("\nProcessing UPI Payment");
        System.out.println("Transaction ID: " +transactionId);
        System.out.println("UPI ID: " +upiId);
        System.out.println("Original Amount: " +amount);
        System.out.println("Transaction Charge: " +charge);
        System.out.println("Final Amount Debited: " +finalAmount);
        System.out.println("Payment Successfull");
    }
}
