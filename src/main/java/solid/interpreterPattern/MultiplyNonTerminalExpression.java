package solid.interpreterPattern;

public class MultiplyNonTerminalExpression implements AbstractExpression {

    private AbstractExpression leftTerminalExpression;
    private AbstractExpression rightTerminalExpression;

    public MultiplyNonTerminalExpression(AbstractExpression leftTerminalExpression,
                                         AbstractExpression rightTerminalExpression) {
        this.leftTerminalExpression = leftTerminalExpression;
        this.rightTerminalExpression = rightTerminalExpression;
    }

    @Override
    public int interpret(Context context) {
        return leftTerminalExpression.interpret(context) * rightTerminalExpression.interpret(context);
    }
}
