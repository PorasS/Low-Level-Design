package solid.decoratorPattern.decorator;

import solid.decoratorPattern.BasePizza;

public class ChessTopping extends ToppingDecorator {
    BasePizza pizza;

    public ChessTopping(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 20;
    }
}
