package solid.interpreterPattern;

public class Client {
    public static void main(String[] args) {

        Context context = new Context();
        context.put("a", 4);
        context.put("b", 2);

        BinaryNonTerminalExpression multiplyExpression = new BinaryNonTerminalExpression(
                new NumberTerminalExpression("a"), new NumberTerminalExpression("b"), '*');

        System.out.println(multiplyExpression.interpret(context));

        context.put("c", 6);
        context.put("d", 5);

        BinaryNonTerminalExpression sumExpression = new BinaryNonTerminalExpression(new BinaryNonTerminalExpression(
                new NumberTerminalExpression("a"), new NumberTerminalExpression("b"), '+'),
                new BinaryNonTerminalExpression(new NumberTerminalExpression("c"),
                        new NumberTerminalExpression("d"), '*'), '+');

        System.out.println(sumExpression.interpret(context));
    }
}
