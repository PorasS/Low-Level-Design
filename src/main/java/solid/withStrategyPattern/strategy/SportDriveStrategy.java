package solid.withStrategyPattern.strategy;

public class SportDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Sport Drive Capability");
    }
}
