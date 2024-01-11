package solid.commandPattern;

public class TurnOnACCommand implements ICommand {

    AirConditionerReceiver receiver;

    TurnOnACCommand(AirConditionerReceiver reciever) {
        this.receiver = reciever;
    }

    @Override
    public void execute() {
        receiver.turnOnAc();
    }

    @Override
    public void undo() {
        receiver.turnAcOff();
    }
}
