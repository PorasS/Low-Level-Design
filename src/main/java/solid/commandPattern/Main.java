package solid.commandPattern;

public class Main {
    public static void main(String[] args) {
        AirConditionerReceiver acReceiver = new AirConditionerReceiver();

        ICommand turnOnACCommand = new TurnOnACCommand(acReceiver);
        ICommand turnOffACCommand = new TurnOffACCommand(acReceiver);

        MyRemoteControlInvoker invoker = new MyRemoteControlInvoker();
        invoker.setCommand(turnOnACCommand);
        invoker.pressButton();
        invoker.setCommand(turnOffACCommand);
        invoker.pressButton();
        invoker.setCommand(turnOnACCommand);
        invoker.pressButton();

        invoker.undo();
    }


}
