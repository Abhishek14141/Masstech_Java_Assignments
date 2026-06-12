package PaymentGatewaySystem;

public class NetBanking extends Payment{

    private String bankName;
    private  final double CHARGE_PERCENT=1.0;

    public NetBanking(double amount, String bankName){
        super(amount);
        this.bankName=bankName;
    }

    @Override
    public void processPayment(){
        double charge=amount*CHARGE_PERCENT/100;
        double finalAmount =amount+charge;

        System.out.println("\nProcessing Net Banking Payment");
        System.out.println("Transaction ID: " +transactionId);
        System.out.println("Bank Name: " +bankName);
        System.out.println("Original Amount: " +amount);
        System.out.println("Transaction Charge: " +charge);
        System.out.println("Final Amount Debited: " +finalAmount);
        System.out.println("Payment Successfull");
    }
}
