package lldQuestions.statePattern.vendingMachine.vendingStates.impl;

import lldQuestions.statePattern.vendingMachine.Coin;
import lldQuestions.statePattern.vendingMachine.Item;
import lldQuestions.statePattern.vendingMachine.VendingMachine;
import lldQuestions.statePattern.vendingMachine.vendingStates.State;

import java.util.List;

public class HasMoneyState implements State {

    public HasMoneyState() {
        System.out.println("Currently Vending Machine Is In HasMoneyState");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("Not Allowed");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        System.out.println("Accepted the coin");
        machine.getCoinList().add(coin);
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("You Need To Select Start Product Selection First");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("You Can Not Dispense Product In Has Money State");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("You Can Not Get Change In Has Money State");
    }

    @Override
    public List<Coin> refundFullAmount(VendingMachine machine) throws Exception {
        System.out.println("You Can Collect Full Refund Amount From The Tray");
        machine.setVendingMachineState(new IdleState(machine));
        return null;
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("You Can Not Update Inventory in HasMoneyState");

    }
}
