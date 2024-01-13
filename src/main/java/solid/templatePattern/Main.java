package solid.templatePattern;

public class Main {
    public static void main(String[] args) {
        PaymentFlow paymentFlow = new PaymentToFriend();
        paymentFlow.sendMoney();
        System.out.println("-------------------");
        paymentFlow = new PaymentToMerchant();
        paymentFlow.sendMoney();
    }
}
