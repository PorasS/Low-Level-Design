package solid.templatePattern;

public class PaymentToFriend extends PaymentFlow {

    @Override
    public void validateRequest() {
        System.out.println("Payment to Friend is Validated Successfully");
    }

    @Override
    public void calculateFees() {
        System.out.println("1 % Payment Fees");
    }

    @Override
    public void debitAmount() {
        System.out.println("Amount is Debited From Your Account");
    }

    @Override
    public void creditAmount() {
        System.out.println("Amount is Credited to Friend's Account");
    }
}
