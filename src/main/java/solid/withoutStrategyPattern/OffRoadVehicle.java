package solid.withoutStrategyPattern;

public class OffRoadVehicle extends Vehicle{
    //OffRoad and Sport both need same sport capability
    //because of this code duplicated
    @Override
    public void drive() {
        System.out.println("Sport Drive Capability");
    }
}
