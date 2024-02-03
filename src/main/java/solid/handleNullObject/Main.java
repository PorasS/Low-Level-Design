package solid.handleNullObject;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleObject("Bike");

        printVehicleDetails(vehicle);
    }

    public static void printVehicleDetails(Vehicle vehicle) {

        System.out.println("Vehicle Seating Capacity: " + vehicle.getSeatingCapacity());
        System.out.println("Vehicle Tank Capacity: " + vehicle.getTankCapacity());

    }
}
