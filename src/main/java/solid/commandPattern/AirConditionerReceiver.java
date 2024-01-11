package solid.commandPattern;

public class AirConditionerReceiver {

    boolean isAcOn;
    int temperature;

    public void turnOnAc() {
        this.isAcOn = true;
        System.out.println("AC is ON");
    }

    public void turnAcOff() {
        this.isAcOn = false;
        System.out.println("AC is OFF");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature is set to: " + temperature);
    }
}
