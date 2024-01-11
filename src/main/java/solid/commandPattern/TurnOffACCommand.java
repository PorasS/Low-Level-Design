package solid.commandPattern;

public class TurnOffACCommand implements ICommand {

    AirConditionerReceiver receiver;

    TurnOffACCommand(AirConditionerReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnAcOff();
    }

    @Override
    public void undo() {
        receiver.turnOnAc();
    }
}
