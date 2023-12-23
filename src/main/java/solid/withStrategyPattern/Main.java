package solid.withStrategyPattern;

public class Main {
    public static void main(String[] args) {
//        Vehicle vehicle = new SportVehicle();
        Vehicle vehicle = new GoodsVehicle();
        vehicle.drive();
    }
}
