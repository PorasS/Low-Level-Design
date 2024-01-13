package solid.templatePattern;

public abstract class PaymentFlow {

    public abstract void validateRequest();

    public abstract void calculateFees();

    public abstract void debitAmount();

    public abstract void creditAmount();


    //this is the template method:
    //In template method we have defined the steps
    //the template method is final, and can not be overridden
    //the subclass strictly need to flow the template method
    public final void sendMoney() {
        //step1
        validateRequest();

        //step2
        calculateFees();

        //step3
        debitAmount();

        //step4
        creditAmount();
    }
}
