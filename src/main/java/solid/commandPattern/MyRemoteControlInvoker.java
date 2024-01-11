package solid.commandPattern;

import java.util.Stack;

public class MyRemoteControlInvoker {
    ICommand command;

    Stack<ICommand> commands = new Stack<>();

    public MyRemoteControlInvoker() {
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        commands.add(command);
    }

    public void undo() {
        //will undo the latest command
        if (!commands.isEmpty()) {
            command = commands.pop();
            command.undo();
        }
    }
}
