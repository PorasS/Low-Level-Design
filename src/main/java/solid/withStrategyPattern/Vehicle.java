package solid.withStrategyPattern;

import solid.withStrategyPattern.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    //this is known as a constructor injection
    Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
