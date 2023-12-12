package withStrategyPattern;

import withStrategyPattern.strategy.SportDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(){
        super(new SportDriveStrategy());
    }
}
