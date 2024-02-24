package solid.adapterPattern;

import solid.adapterPattern.adaptee.WeightMachineForBabies;
import solid.adapterPattern.adapter.WeightMachineAdapter;
import solid.adapterPattern.adapter.WeightMachineAdapterImpl;

public class Main {

    public static void main(String[] args) {
        //passing existing interface Obj to adapter
        WeightMachineAdapter weightMachineForBabiesAdapter =
                new WeightMachineAdapterImpl(new WeightMachineForBabies());

        System.out.println("Weight In Kgs: " + weightMachineForBabiesAdapter.getWeightInKg());
    }
}
