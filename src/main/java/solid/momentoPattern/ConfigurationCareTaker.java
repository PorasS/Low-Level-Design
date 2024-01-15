package solid.momentoPattern;

import java.util.ArrayList;
import java.util.List;

//CareTaker
public class ConfigurationCareTaker {
    List<ConfigurationMemento> history = new ArrayList<>();

    public void addMemento(ConfigurationMemento configurationMemento) {
        history.add(configurationMemento);
    }

    public ConfigurationMemento undo() {
        if (!history.isEmpty()) {
            int lastMementoIndex = history.size() - 1;

            //get the last memento from the list
            ConfigurationMemento memento = history.get(lastMementoIndex);

            //remove the last memento from the list now
            history.remove(memento);
            return memento;
        }

        return null;
    }
}
