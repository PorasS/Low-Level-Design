package lldQuestions.statePattern.vendingMachine;

import lldQuestions.statePattern.vendingMachine.vendingStates.State;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        try {
            System.out.println("|");
            System.out.println("Filling Up The Inventory");
            System.out.println("|");

            fillUpInventory(machine);
            displayInventory(machine);

            System.out.println("|");
            System.out.println("Clicking On Insert Coin Button");
            System.out.println("|");

            State machineState = machine.getVendingMachineState();
            machineState.clickOnInsertCoinButton(machine);

            //HasMoneyState
            machineState = machine.getVendingMachineState();
            machineState.insertCoin(machine, Coin.DIME);
            machineState.insertCoin(machine, Coin.NICKEL);

            System.out.println("|");
            System.out.println("Clicking On Product Selection Button");
            System.out.println("|");

            machineState.clickOnStartProductSelectionButton(machine);
            machineState = machine.getVendingMachineState();
            machineState.chooseProduct(machine, 101);

            displayInventory(machine);

//            machineState = machine.getVendingMachineState();
//            machineState.dispenseProduct(machine, 101);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void fillUpInventory(VendingMachine machine) {
        ItemShelf[] slots = machine.getInventory().getInventory();
        for (int i = 0; i < slots.length; i++) {
            Item item = new Item();
            if (i >= 0 && i < 3) {
                item.setType(ItemType.COKE);
                item.setPrice(10);
            } else if (i >= 3 && i < 6) {
                item.setType(ItemType.PEPSI);
                item.setPrice(27);
            } else if (i >= 6 && i < 10) {
                item.setType(ItemType.SODA);
                item.setPrice(15);
            }

            slots[i].setItem(item);
            slots[i].setSoldOut(false);
        }
    }

    public static void displayInventory(VendingMachine machine) {
        ItemShelf[] itemShelves = machine.getInventory().getInventory();
        for (int i = 0; i < itemShelves.length; i++) {
            System.out.println("ShelfNo: " + itemShelves[i].getCode() + ", Product: " + itemShelves[i].getItem().type +
                    " Item Price: " + itemShelves[i].getItem().getPrice() +
                    ", IsSoldOut: " + itemShelves[i].isSoldOut());

        }
    }
}
