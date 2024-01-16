package solid.interpreterPattern;

public class Client {
    public static void main(String[] args) {

        Context context = new Context();
        context.put("a", 4);
        context.put("b", 12);

        MultiplyNonTerminalExpression multiplyExpression = new MultiplyNonTerminalExpression(
                new NumberTerminalExpression("a"), new NumberTerminalExpression("b"));

        System.out.println(multiplyExpression.interpret(context));
    }
}
