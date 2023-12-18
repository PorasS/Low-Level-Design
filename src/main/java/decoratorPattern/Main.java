package decoratorPattern;

import decoratorPattern.decorator.ChessTopping;
import decoratorPattern.decorator.MushroomTopping;

public class Main {
    public static void main(String[] args) {
        BasePizza farmHouse = new MushroomTopping(new FarmHouse());

        System.out.println("FarmHouse with Mushroom cost : " + farmHouse.cost());

        BasePizza pizzaWithChess = new ChessTopping(farmHouse);

        System.out.println("FarmHouse with Mushroom plus extra chess cost : " + pizzaWithChess.cost());

        BasePizza pizzaWithExtraMushroom = new MushroomTopping(pizzaWithChess);

        System.out.println("FarmHouse with Mushroom plus extra chess plus extra mushroom cost : " + pizzaWithExtraMushroom.cost());

        BasePizza vegDelight = new MushroomTopping(new VegDelight());

        System.out.println("Veg Delight Pizza with extra Mushroom : " + vegDelight.cost());

    }
}
