package solid.momentoPattern;

public class Client {
    public static void main(String[] args) {
        ConfigurationCareTaker careTakerObject = new ConfigurationCareTaker();

        //initialize State of the Originator
        ConfigurationOriginator originator = new ConfigurationOriginator(5, 10);

        //Save it
        ConfigurationMemento snapshot1 = originator.createMemento();

        //add it to history
        careTakerObject.addMemento(snapshot1);

        //Originator changing the new state
        originator.setHeight(7);
        originator.setWidth(21);

        //save it
        ConfigurationMemento snapshot2 = originator.createMemento();

        //add to history
        careTakerObject.addMemento(snapshot2);

        //Originator changing the new state
        originator.setHeight(76);
        originator.setWidth(98);

        //Something went wrong, now I want to restore
        //UNDO
        ConfigurationMemento restoredStateMementoObj = careTakerObject.undo();
        originator.restoreMemento(restoredStateMementoObj);

        System.out.println("Height: "+restoredStateMementoObj.getHeight() +
                " Width: "+restoredStateMementoObj.getWidth());
    }
}
