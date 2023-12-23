package solid.withStrategyPattern;

import solid.withStrategyPattern.strategy.SportDriveStrategy;

public class SportVehicle extends Vehicle{
    SportVehicle(){
        super(new SportDriveStrategy());
    }
}
