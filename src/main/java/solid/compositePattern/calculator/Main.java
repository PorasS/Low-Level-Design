package solid.compositePattern.calculator;

public class Main {
    public static void main(String[] args) {
        //2 * (1 + 7)
        ArithmeticExpression num1 = new Number(2);
        ArithmeticExpression num2 = new Number(1);
        ArithmeticExpression num3 = new Number(7);

        ArithmeticExpression addExpression = new Expression(num2, num3, Operation.ADD);
        ArithmeticExpression multiplyExpression = new Expression(num1, addExpression, Operation.MULTIPLY);

        System.out.println(multiplyExpression.evaluate());
    }
}
