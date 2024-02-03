package solid.handleNullObject;

import java.util.Map;

public class VehicleFactory {

    public static Vehicle getVehicleObject(String vehicle) {
        switch (vehicle) {
            case "CAR":
                return new Car();
            default:
                return new NullVehicle();
        }
    }


}
