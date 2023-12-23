package solid.decoratorPattern.decorator;

import solid.decoratorPattern.BasePizza;

public class MushroomTopping extends ToppingDecorator {
    BasePizza pizza;

    public MushroomTopping(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 10;
    }
}
