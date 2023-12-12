package withStrategyPattern;

import withStrategyPattern.strategy.SportDriveStrategy;

public class SportVehicle extends Vehicle{
    SportVehicle(){
        super(new SportDriveStrategy());
    }
}
