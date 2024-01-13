package solid.templatePattern;

public class PaymentToMerchant extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("Payment to Merchant is Validated Successfully");
    }

    @Override
    public void calculateFees() {
        System.out.println("3 % Payment Fees");
    }

    @Override
    public void debitAmount() {
        System.out.println("Amount is Debited From Your Account");
    }

    @Override
    public void creditAmount() {
        System.out.println("Amount is Credited to Merchant's Account");
    }
}
