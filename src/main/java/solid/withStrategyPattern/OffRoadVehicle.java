package solid.withStrategyPattern;

import solid.withStrategyPattern.strategy.SportDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(){
        super(new SportDriveStrategy());
    }
}
